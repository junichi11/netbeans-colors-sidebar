/*
 * Copyright 2019 junichi11.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.junichi11.netbeans.modules.color.codes.preview.colors.spi;

import java.awt.Color;

/**
 * Color code formatter.
 *
 * @since 0.10.0
 * @author junichi11
 */
public interface ColorCodeFormatter {

    /**
     * Output the color with the specific format.
     *
     * @since 0.10.0
     * @param color
     * @return the formatted color
     */
    public String format(Color color);
}
