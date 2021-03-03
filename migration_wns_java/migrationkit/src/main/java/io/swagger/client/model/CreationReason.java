/*
 * eGov Property Registry System.
 * APIs for Property Registry module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

/**
 * New property comes into system either property is newly constructed or existing property got sub divided. Here the reason for creation will be captured.
 */
 
public enum CreationReason {
  NEWPROPERTY("NEWPROPERTY"),
  SUBDIVISION("SUBDIVISION"),
  CREATE("CREATE");

  private String value;

  CreationReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreationReason fromValue(String text) {
    for (CreationReason b : CreationReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  
}