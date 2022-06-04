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
 * For classes:
 * <p>
 * Represents a promise that the class will behave in a thread-safe way. Note that this is a deep promise; i.e. the entire object graph that is reachable from
 * instances of this class must be thread-safe.
 * <p>
 * For interfaces:
 * <p>
 * Represents a promise that classes implementing the interface will behave in a thread-safe way. Note that this is a deep promise; i.e. the entire object graph
 * that is reachable from instances of classes implementing this interface must be thread-safe.
 * <p>
 * For fields:
 * <p>
 * Represents a promise that the field will only mutate in a thread-safe way. Can only be used on private, non-final fields. Note that this is a shallow
 * promise; i.e. the promise is given only with regard to the field itself, and not with regard to whatever object might be referenced by the field. So, the
 * thread-safety of the object referenced by the field will need to be assessed separately.
 * <p>
 * NOTE: An annotation with the same name is defined in jcip-annotations, but it is only applicable to types, whereas Bathyscaphe also makes it applicable to
 * fields.
 *
 * @author michael.gr
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( { ElementType.FIELD, ElementType.TYPE } )
public @interface ThreadSafe
{ }
