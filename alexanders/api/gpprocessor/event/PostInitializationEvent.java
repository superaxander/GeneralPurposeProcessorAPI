package alexanders.api.gpprocessor.event;

import alexanders.api.gpprocessor.Reference;
import alexanders.api.gpprocessor.plugin.LoadState;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;

public class PostInitializationEvent extends GPPEvent
{
    private Map<String, LoadState> plugins;

    public PostInitializationEvent()
    {
    }

    public PostInitializationEvent(Map<String, LoadState> plugins)
    {
        this.plugins = plugins;
    }

    public Map<String, LoadState> getPlugins()
    {
        return plugins;
    }

    public Optional<?> buildSoftDependantObject(String pluginID, String classname, Object... arguments)
    {
        String msg = "Building of a soft dependant object failed, class:" + classname + "from plugin: " + pluginID;
        if (plugins.getOrDefault(pluginID, LoadState.ERROR) != LoadState.ERROR)
        {
            List<Object> argumentsList = Arrays.asList(arguments);
            Class<?>[] args = new Class<?>[arguments.length];
            for (int i = 0; i < arguments.length; i++)
            {
                args[i] = argumentsList.get(i).getClass();
            }
            try
            {
                Class<?> foundClass = Class.forName(classname, true, Reference.loaders.get(pluginID));
                Constructor<?> constructor = foundClass.getConstructor(args);
                return Optional.of(constructor.newInstance(arguments));
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e)
            {
                Reference.logger.logp(Level.INFO, msg, "buildSoftDependantObject", this.getClass().getSimpleName());
                Reference.logger.logp(Level.FINE, msg, "buildSoftDependantObject", this.getClass().getSimpleName(), e);
            }
        }
        Reference.logger.logp(Level.INFO, msg, "buildSoftDependantObject", this.getClass().getSimpleName());
        return Optional.empty();
    }
}
