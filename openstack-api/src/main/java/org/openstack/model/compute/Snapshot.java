package org.openstack.model.compute;

public interface Snapshot {

	Integer getId();

	Integer getStatus();

	Integer getSizeInGB();

	Integer getAvailabilityZone();

	String getType();

	String getCreated();

	String getName();

	String getDescription();

	Integer getVolumeId();

}