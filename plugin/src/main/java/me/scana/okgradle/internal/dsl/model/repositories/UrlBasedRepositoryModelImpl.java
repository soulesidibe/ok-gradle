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
import me.scana.okgradle.internal.dsl.api.repositories.UrlBasedRepositoryModel;
import me.scana.okgradle.internal.dsl.model.ext.GradlePropertyModelBuilder;
import me.scana.okgradle.internal.dsl.model.ext.transforms.RepositoryClosureTransform;
import me.scana.okgradle.internal.dsl.model.repositories.RepositoryModelImpl;
import me.scana.okgradle.internal.dsl.parser.elements.GradleDslElement;
import me.scana.okgradle.internal.dsl.parser.elements.GradlePropertiesDslElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Base class for all the url based repository models like Maven and JCenter.
 */
public abstract class UrlBasedRepositoryModelImpl extends RepositoryModelImpl implements UrlBasedRepositoryModel {
  @NonNls public static final String URL = "url";

  @NotNull private final String myDefaultRepoUrl;

  protected UrlBasedRepositoryModelImpl(@NotNull GradlePropertiesDslElement holder,
                                        @NotNull GradleDslElement dslElement,
                                        @NotNull String defaultRepoName,
                                        @NotNull String defaultRepoUrl) {
    super(holder, dslElement, defaultRepoName);
    myDefaultRepoUrl = defaultRepoUrl;
  }

  @Override
  @NotNull
  public ResolvedPropertyModel url() {
    return GradlePropertyModelBuilder.create(myDslElement).asMethod(true).addTransform(new RepositoryClosureTransform(myHolder, URL, myDefaultRepoUrl)).buildResolved();
  }
}
