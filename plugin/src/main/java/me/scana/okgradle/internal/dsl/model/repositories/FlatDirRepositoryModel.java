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
package me.scana.okgradle.internal.dsl.model.repositories;

import me.scana.okgradle.internal.dsl.api.ext.ResolvedPropertyModel;
import me.scana.okgradle.internal.dsl.model.ext.GradlePropertyModelBuilder;
import me.scana.okgradle.internal.dsl.model.repositories.RepositoryModelImpl;
import me.scana.okgradle.internal.dsl.parser.elements.GradlePropertiesDslElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a repository defined with flatDir {dirs "..."} or flatDir dirs : ["..."].
 */
public class FlatDirRepositoryModel extends RepositoryModelImpl {
  @NotNull public GradlePropertiesDslElement myPropertiesDslElement;

  @NonNls public static final String FLAT_DIR_ATTRIBUTE_NAME = "flatDir";

  @NonNls private static final String DIRS = "dirs";

  public FlatDirRepositoryModel(@NotNull GradlePropertiesDslElement holder, @NotNull GradlePropertiesDslElement dslElement) {
    super(holder, dslElement, "flatDir");
    myPropertiesDslElement = dslElement;
  }

  @NotNull
  public ResolvedPropertyModel dirs() {
    return GradlePropertyModelBuilder.create(myPropertiesDslElement, DIRS).asMethod(true).buildResolved();
  }

  @NotNull
  @Override
  public RepositoryType getType() {
    return RepositoryType.FLAT_DIR;
  }
}
