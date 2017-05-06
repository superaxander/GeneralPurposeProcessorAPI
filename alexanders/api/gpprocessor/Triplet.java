package alexanders.api.gpprocessor;

import java.util.function.BiConsumer;

public class Triplet<L, M, R>
{
    public L left;
    public M middle;
    public R right;

    public Triplet(L left, M middle, R right)
    {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public void forEach(TriConsumer<L, M, R> consumer)
    {
        consumer.apply(left, middle, right);
    }
}
