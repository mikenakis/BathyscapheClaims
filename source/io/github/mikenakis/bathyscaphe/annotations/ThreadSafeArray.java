/*
 * Copyright (c) 2022 Michael Belivanakis a.k.a. MikeNakis, michael.gr
 *
 * For licensing information, please see LICENSE.md.
 * You may not use this file except in compliance with the license.
 */

package io.github.mikenakis.bathyscaphe.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents a promise that a certain array field will only mutate in a thread-safe way. Can only be used on private, non-final fields of array type. Note that
 * this is a shallow promise; i.e. the promise is given only with regard to the array itself, and not with regard to whatever objects might be referenced by the
 * array. So, the thread-safety of the objects referenced by the array will need to be assessed separately.
 * <p>
 * NOTE: An annotation with the same name is defined in jcip-annotations, but it is only applicable to types, whereas Bathyscaphe also makes it applicable to
 * fields.
 *
 * @author michael.gr
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( { ElementType.FIELD } )
public @interface ThreadSafeArray
{ }
