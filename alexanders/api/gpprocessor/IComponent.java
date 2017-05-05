package alexanders.api.gpprocessor;

import alexanders.api.gpprocessor.capability.Capability;

public interface IComponent
{
    boolean hasInputCapability(Capability<?> capability);

    boolean hasOutputCapability(Capability<?> capability);

    <T> T getInputCapability(Capability<T> capability);

    <T> T getOutputCapability(Capability<T> capability);

    void input(Object... inputs);

    void process();

    Object[] output();
}
