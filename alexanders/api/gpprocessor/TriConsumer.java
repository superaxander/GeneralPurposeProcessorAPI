package alexanders.api.gpprocessor;

public interface TriConsumer<L, M, R>
{
    void apply(L l, M m, R r);
}
