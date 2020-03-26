package com.mobaas.kubernetes.metrics.models;

import java.util.Objects;

import org.joda.time.DateTime;

import com.google.gson.annotations.SerializedName;

import io.kubernetes.client.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class MetricsV1beta1NodeMetrics {
	  @SerializedName("apiVersion")
	  private String apiVersion = null;

	  @SerializedName("kind")
	  private String kind = null;

	  @SerializedName("metadata")
	  private V1ObjectMeta metadata = null;

	  @SerializedName("timestamp")
	  private DateTime timestamp = null;
	  
	  @SerializedName("window")
	  private String window = null;
	  
	  @SerializedName("usage")
	  private MetricsV1beta1NodeUsage usage;
	  
	  public MetricsV1beta1NodeMetrics apiVersion(String apiVersion) {
	    this.apiVersion = apiVersion;
	    return this;
	  }
	  
	  @ApiModelProperty
	  public String getApiVersion() {
	    return apiVersion;
	  }

	  public void setApiVersion(String apiVersion) {
	    this.apiVersion = apiVersion;
	  }

	  public MetricsV1beta1NodeMetrics kind(String kind) {
	    this.kind = kind;
	    return this;
	  }
	  
	  @ApiModelProperty
	  public String getKind() {
	    return kind;
	  }

	  public void setKind(String kind) {
	    this.kind = kind;
	  }

	  public MetricsV1beta1NodeMetrics metadata(V1ObjectMeta metadata) {
	    this.metadata = metadata;
	    return this;
	  }
	  
	  @ApiModelProperty
	  public V1ObjectMeta getMetadata() {
	    return metadata;
	  }

	  public void setMetadata(V1ObjectMeta metadata) {
	    this.metadata = metadata;
	  }

	  public MetricsV1beta1NodeMetrics timestamp(DateTime timestamp) {
	    this.timestamp = timestamp;
	    return this;
	  }
	  
	  @ApiModelProperty
	  public DateTime getTimestamp() {
	    return timestamp;
	  }

	  public void setTimestamp(DateTime timestamp) {
	    this.timestamp = timestamp;
	  }
	  
	  public MetricsV1beta1NodeMetrics window(String window) {
	    this.window = window;
	    return this;
	  }
	  
	  @ApiModelProperty
	  public String getWindow() {
	    return window;
	  }

	  public void setWindow(String window) {
	    this.window = window;
	  }
		  
	  public MetricsV1beta1NodeMetrics usage(MetricsV1beta1NodeUsage usage) {
	    this.usage = usage;
	    return this;
	  }

	  public MetricsV1beta1NodeUsage getUsage() {
	    return usage;
	  }

	  public void setUsage(MetricsV1beta1NodeUsage usage) {
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
	    MetricsV1beta1NodeMetrics nodeMetrics = (MetricsV1beta1NodeMetrics) o;
	    return Objects.equals(this.apiVersion, nodeMetrics.apiVersion) &&
	        Objects.equals(this.kind, nodeMetrics.kind) &&
	        Objects.equals(this.metadata, nodeMetrics.metadata) &&
	        Objects.equals(this.timestamp, nodeMetrics.timestamp) &&
	        Objects.equals(this.window, nodeMetrics.window) &&
	        Objects.equals(this.usage, nodeMetrics.usage);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(apiVersion, kind, metadata, timestamp, window, usage);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class MetricsV1beta1NodeMetrics {\n");
	    
	    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
	    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
	    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
	    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
	    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
