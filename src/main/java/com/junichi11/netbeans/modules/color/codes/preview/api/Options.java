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
package com.junichi11.netbeans.modules.color.codes.preview.api;

import com.junichi11.netbeans.modules.color.codes.preview.options.ColorCodesPreviewOptions;
import com.junichi11.netbeans.modules.color.codes.preview.spi.ColorCodesProvider;

/**
 *
 * @author junichi11
 */
public final class Options {

    private static final Options INSTANCE = new Options();

    private Options() {
    }

    /**
     * Get instance of Options.
     *
     * @since 0.10.0
     * @return Options
     */
    public static final Options getInstance() {
        return INSTANCE;
    }

    /**
     * Check whether the provider is enabled.
     *
     * @since 0.10.0
     * @param provider the provider
     * @return {@code true} if it is enabled, otherwise {@code false}
     */
    public boolean isEnabled(ColorCodesProvider provider) {
        return ColorCodesPreviewOptions.getInstance().isEnabled(provider.getId());
    }
}
