/**
 * Copyright (C) 2019 Expedia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hotels.map.transformer;

import java.util.Map;

/**
 * Utility methods for populating {@link java.util.Map} elements via reflection.
 */
public class MapTransformerImpl extends AbstractMapTransformer {
    /**
     * {@inheritDoc}
     */
    @Override
    public <T, K, R, V> Map<R, V> transform(final Map<T, K> sourceMap, final Class<? extends Map<R, V>> targetMapClass, final BeanTransformer beanTransformer) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T, K, R, V> void transform(final Map<T, K> sourceMap, final Map<R, V> targetMap, final BeanTransformer beanTransformer) {

    }
}