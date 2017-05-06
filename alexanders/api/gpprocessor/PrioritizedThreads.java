package alexanders.api.gpprocessor;

public class PrioritizedThreads
{
    public static class BackgroundWorkerThread extends Thread
    {
        public BackgroundWorkerThread()
        {
        }

        public BackgroundWorkerThread(Runnable target)
        {
            super(target);
        }

        public BackgroundWorkerThread(ThreadGroup group, Runnable target)
        {
            super(group, target);
        }

        public BackgroundWorkerThread(String name)
        {
            super(name);
        }

        public BackgroundWorkerThread(ThreadGroup group, String name)
        {
            super(group, name);
        }

        public BackgroundWorkerThread(Runnable target, String name)
        {
            super(target, name);
        }

        public BackgroundWorkerThread(ThreadGroup group, Runnable target, String name)
        {
            super(group, target, name);
        }

        public BackgroundWorkerThread(ThreadGroup group, Runnable target, String name, long stackSize)
        {
            super(group, target, name, stackSize);
        }
    }

    public static class WorkerThread extends Thread
    {
        public WorkerThread()
        {
        }

        public WorkerThread(Runnable target)
        {
            super(target);
        }

        public WorkerThread(ThreadGroup group, Runnable target)
        {
            super(group, target);
        }

        public WorkerThread(String name)
        {
            super(name);
        }

        public WorkerThread(ThreadGroup group, String name)
        {
            super(group, name);
        }

        public WorkerThread(Runnable target, String name)
        {
            super(target, name);
        }

        public WorkerThread(ThreadGroup group, Runnable target, String name)
        {
            super(group, target, name);
        }

        public WorkerThread(ThreadGroup group, Runnable target, String name, long stackSize)
        {
            super(group, target, name, stackSize);
        }
    }

    public static class GUIUpdateThread extends Thread
    {
        public GUIUpdateThread()
        {
        }

        public GUIUpdateThread(Runnable target)
        {
            super(target);
        }

        public GUIUpdateThread(ThreadGroup group, Runnable target)
        {
            super(group, target);
        }

        public GUIUpdateThread(String name)
        {
            super(name);
        }

        public GUIUpdateThread(ThreadGroup group, String name)
        {
            super(group, name);
        }

        public GUIUpdateThread(Runnable target, String name)
        {
            super(target, name);
        }

        public GUIUpdateThread(ThreadGroup group, Runnable target, String name)
        {
            super(group, target, name);
        }

        public GUIUpdateThread(ThreadGroup group, Runnable target, String name, long stackSize)
        {
            super(group, target, name, stackSize);
        }
    }

    public static class EventThread extends Thread
    {
        public EventThread()
        {
        }

        public EventThread(Runnable target)
        {
            super(target);
        }

        public EventThread(ThreadGroup group, Runnable target)
        {
            super(group, target);
        }

        public EventThread(String name)
        {
            super(name);
        }

        public EventThread(ThreadGroup group, String name)
        {
            super(group, name);
        }

        public EventThread(Runnable target, String name)
        {
            super(target, name);
        }

        public EventThread(ThreadGroup group, Runnable target, String name)
        {
            super(group, target, name);
        }

        public EventThread(ThreadGroup group, Runnable target, String name, long stackSize)
        {
            super(group, target, name, stackSize);
        }
    }

    public static int getPriorityForThread(Thread thread)
    {
        if (thread instanceof BackgroundWorkerThread)
            return Thread.MIN_PRIORITY;
        if (thread instanceof WorkerThread)
            return Thread.MAX_PRIORITY - 1;
        if (thread instanceof GUIUpdateThread)
            return Thread.NORM_PRIORITY + 1;
        if (thread instanceof EventThread)
            return Thread.MAX_PRIORITY;
        return Thread.NORM_PRIORITY;
    }
}
