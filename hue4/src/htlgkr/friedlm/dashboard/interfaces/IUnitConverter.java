package htlgkr.friedlm.dashboard.interfaces;

@FunctionalInterface
public interface IUnitConverter<T,R> {
    R convert(T value);
}
