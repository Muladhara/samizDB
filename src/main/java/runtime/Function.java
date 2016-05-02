package runtime;

import model.ComponentType;

import java.io.Serializable;
import java.util.List;

/*
@FunctionalInterface
public interface Function<T>{
*/
public abstract class Function<C>  {

    public abstract C performOperation();

}
