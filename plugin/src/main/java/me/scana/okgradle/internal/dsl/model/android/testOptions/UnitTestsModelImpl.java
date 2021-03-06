/*
 * Copyright (C) 2016 The Android Open Source Project
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
package me.scana.okgradle.internal.dsl.model.android.testOptions;

import me.scana.okgradle.internal.dsl.api.android.testOptions.UnitTestsModel;
import me.scana.okgradle.internal.dsl.api.ext.ResolvedPropertyModel;
import me.scana.okgradle.internal.dsl.model.GradleDslBlockModel;
import me.scana.okgradle.internal.dsl.parser.android.testOptions.UnitTestsDslElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class UnitTestsModelImpl extends GradleDslBlockModel implements UnitTestsModel {
  @NonNls private static final String RETURN_DEFAULT_VALUES = "returnDefaultValues";

  public UnitTestsModelImpl(@NotNull UnitTestsDslElement dslElement) {
    super(dslElement);
  }

  @Override
  @NotNull
  public ResolvedPropertyModel returnDefaultValues() {
    return getModelForProperty(RETURN_DEFAULT_VALUES, true);
  }
}
