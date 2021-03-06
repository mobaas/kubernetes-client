package com.mobaas.kubernetes.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1ListMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PodMetricsList is a collection of Metrics.
 */
@ApiModel(description = "PodMetricsList is a collection of Metrics.")
public class MetricsV1beta1PodMetricsList {

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<MetricsV1beta1PodMetrics> items = new ArrayList<MetricsV1beta1PodMetrics>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public MetricsV1beta1PodMetricsList apiVersion(String apiVersion) {
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

  public MetricsV1beta1PodMetricsList items(List<MetricsV1beta1PodMetrics> items) {
    this.items = items;
    return this;
  }

  public MetricsV1beta1PodMetricsList addItemsItem(MetricsV1beta1PodMetrics itemsItem) {
    this.items.add(itemsItem);
    return this;
  }
  
  @ApiModelProperty
  public List<MetricsV1beta1PodMetrics> getItems() {
    return items;
  }

  public void setItems(List<MetricsV1beta1PodMetrics> items) {
    this.items = items;
  }

  public MetricsV1beta1PodMetricsList kind(String kind) {
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

  public MetricsV1beta1PodMetricsList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsV1beta1PodMetricsList metricsList = (MetricsV1beta1PodMetricsList) o;
    return Objects.equals(this.apiVersion, metricsList.apiVersion) &&
        Objects.equals(this.items, metricsList.items) &&
        Objects.equals(this.kind, metricsList.kind) &&
        Objects.equals(this.metadata, metricsList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsV1beta1PodMetricsList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


