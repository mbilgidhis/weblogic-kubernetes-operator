// Copyright (c) 2017, 2020, Oracle Corporation and/or its affiliates.
// Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.

package oracle.kubernetes.operator;

/**
 * This class lists bugs in libraries that require workarounds. Code using those workarounds should
 * use the appropriate constants to enable them. That will allow tracking.
 */
public class Workarounds {

  // io.kubernetes.client.custom.IntOrString does not define equals() so it
  // fails when comparing objects that are equal but not the same instance.
  // This breaks some K8s model comparisons.

  // Reported to https://github.com/kubernetes-client/java as issue #282
  public static final boolean INTORSTRING_BAD_EQUALS = false;
}
