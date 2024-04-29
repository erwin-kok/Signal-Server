/*
 * Copyright 2024 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.whispersystems.textsecuregcm.configuration;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.dropwizard.jackson.Discoverable;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = DefaultAwsCredentialsFactory.class)
public interface AwsCredentialsProviderFactory extends Discoverable {

  AwsCredentialsProvider build();
}
