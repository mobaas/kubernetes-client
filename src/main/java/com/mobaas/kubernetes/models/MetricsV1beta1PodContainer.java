package com.mobaas.kubernetes.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class MetricsV1beta1PodContainer {
	  @SerializedName("name")
	  private String name = null;

	  @SerializedName("usage")
	  private MetricsV1beta1PodContainerUsage usage = null;

	  public MetricsV1beta1PodContainer name(String name) {
	    this.name = name;
	    return this;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  public MetricsV1beta1PodContainer usage(MetricsV1beta1PodContainerUsage usage) {
	    this.usage = usage;
	    return this;
	  }
	  
	  public MetricsV1beta1PodContainerUsage getUsage() {
	    return usage;
	  }

	  public void setUsage(MetricsV1beta1PodContainerUsage usage) {
	    this.usage = usage;
	  }

	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    MetricsV1beta1PodContainer podContainer = (MetricsV1beta1PodContainer) o;
	    return Objects.equals(this.name, podContainer.name) &&
	        Objects.equals(this.usage, podContainer.usage);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(name, usage);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class MetricsV1beta1PodContainer {\n");
	    
	    sb.append("    name: ").append(toIndentedString(name)).append("\n");
	    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
}
