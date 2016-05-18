/*
Copyright 2016 Thomas Rudin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.rudin.s7connector.bean.annotation;

import io.rudin.s7connector.impl.utils.S7Type;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines an Offset in a DB
 * @author Thomas Rudin
 *
 */
@Target(value={ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface S7Variable
{
	/**
	 * The Byte Offset
	 * @return
	 */
	int byteOffset();
	
	/**
	 * The bit offset, if any
	 * @return
	 */
	int bitOffset() default 0;
	
	/**
	 * The specified size (for String)
	 * @return
	 */
	int size() default 0;
	
	/**
	 * The corresponding S7 Type
	 * @return
	 */
	S7Type type();
	
	/**
	 * The size of the array
	 * @return
	 */
	int arraySize() default 1;
	
}
