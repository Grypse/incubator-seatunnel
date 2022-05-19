/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.api.table.type;

import java.lang.reflect.Field;

public class PojoType<T> implements SeaTunnelDataType<T> {

    private final Class<T> pojoClass;
    private final Field[] fields;
    private final SeaTunnelDataType<?>[] fieldTypes;

    public PojoType(Class<T> pojoClass) {
        this(pojoClass, null, null);
    }

    public PojoType(Class<T> pojoClass, Field[] fields, SeaTunnelDataType<?>[] fieldTypes) {
        this.pojoClass = pojoClass;
        this.fields = fields;
        this.fieldTypes = fieldTypes;
    }

    public Class<T> getPojoClass() {
        return pojoClass;
    }

    public Field[] getFields() {
        return fields;
    }

    public SeaTunnelDataType<?>[] getFieldTypes() {
        return fieldTypes;
    }
}