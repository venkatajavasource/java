package com.devjavasource.concurrency.tuples;

import java.io.Serializable;

import org.jetbrains.annotations.NotNull;
import com.google.common.base.Preconditions;

import net.jcip.annotations.ThreadSafe;

/**
 * An immutable, serializable 2-tuple class.
 * this can be used as Key in Hash maps.
 * 
 * @author devjavasource.
 *
 * @param <A>
 * @param <B>
 */
@ThreadSafe
public class Tuple<A extends Serializable, B extends Serializable> implements Serializable{

	private static final long serialVersionUID = 42L;
	private A _first;
	private B _second;
	
	private Tuple(@NotNull final A inA, @NotNull final B inB){
		_first = inA;
		_second = inB;
	}
	
	/**
	 * Create a Factory to initialize
	 * @param inA first Tuple
	 * @param inB second Tuple
	 * @return tuple
	 */
	public static <A extends Serializable, B extends Serializable> Tuple<A, B> create(@NotNull final A inA, @NotNull final B inB) {
		Preconditions.checkNotNull(inA, "Null not accepted for first argument");
		Preconditions.checkNotNull(inB, "Null not accepted for second argument");
		return new Tuple<>(inA, inB);
	}

	@Override	
	public boolean equals(Object inObject) {
		if(this == inObject) return true;
		
		if(inObject == null || getClass() != inObject.getClass())
			return false;		
		
		Tuple<?, ?> tuple = (Tuple<?, ?>) inObject;
		
		if(!getFirst().equals(tuple.getFirst()))
			return false;
		
		if(!getSecond().equals(tuple.getSecond()))
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int result = getFirst().hashCode();
		result = 31 * result + getSecond().hashCode();
		return result;
	}
	
	@Override
	public String toString() {
		return "Tuple{_first=" + getFirst() + ", _second=" + getSecond() + "}";
	}
	@NotNull
	public A getFirst() {
		return _first;
	}
	
	@NotNull
	public B getSecond() {
		return _second;
	}
	
	@NotNull
	public String asCompoundKeyString() {
		return _first.toString() + _second.toString();
	}
}
