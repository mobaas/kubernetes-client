package com.mobaas.kubernetes.metrics.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class MetricsV1beta1PodContainerUsage {
	 @SerializedName("cpu")
	  private String cpu = null;

	  @SerializedName("memory")
	  private String memory = null;

	  public MetricsV1beta1PodContainerUsage cpu(String cpu) {
	    this.cpu = cpu;
	    return this;
	  }

	  public String getCpu() {
	    return cpu;
	  }

	  public void setCpu(String cpu) {
		  this.cpu = cpu;
	  }
	  
	  public MetricsV1beta1PodContainerUsage memory(String memory) {
	    this.memory = memory;
	    return this;
	  }
	  
	  public String getMemory() {
	    return memory;
	  }

	  public void setMemory(String kind) {
	    this.memory = kind;
	  }

	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    MetricsV1beta1PodContainerUsage containerUsage = (MetricsV1beta1PodContainerUsage) o;
	    return Objects.equals(this.cpu, containerUsage.cpu) &&
	        Objects.equals(this.memory, containerUsage.memory);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(cpu, memory);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class MetricsV1beta1PodContainerUsage {\n");
	    
	    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
	    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
