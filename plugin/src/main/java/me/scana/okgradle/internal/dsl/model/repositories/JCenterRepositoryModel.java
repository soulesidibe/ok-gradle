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

import me.scana.okgradle.internal.dsl.model.repositories.MavenRepositoryModelImpl;
import me.scana.okgradle.internal.dsl.parser.elements.GradlePropertiesDslElement;
import me.scana.okgradle.internal.dsl.parser.repositories.MavenRepositoryDslElement;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a repository defined with jcenter {}.
 */
public class JCenterRepositoryModel extends MavenRepositoryModelImpl {
  public JCenterRepositoryModel(@NotNull GradlePropertiesDslElement holder, @NotNull MavenRepositoryDslElement dslElement) {
    super(holder, dslElement, "BintrayJCenter2", "https://jcenter.bintray.com/");
  }
}
