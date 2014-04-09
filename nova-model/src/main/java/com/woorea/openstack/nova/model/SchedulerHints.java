/**
 *
 * SIROCCO
 * Copyright (C) 2014 Orange
 * Contact: sirocco@ow2.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307
 * USA
 *
 */
package com.woorea.openstack.nova.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName("snapshot")
public class SchedulerHints implements Serializable {
	@JsonProperty("same_host")
	private List<String> sameHosts;
	@JsonProperty("different_host")
	private List<String> differentHosts;
	public List<String> getSameHosts() {
		return sameHosts;
	}
	public void setSameHosts(List<String> sameHosts) {
		this.sameHosts = sameHosts;
	}
	public List<String> getDifferentHosts() {
		return differentHosts;
	}
	public void setDifferentHosts(List<String> differentHosts) {
		this.differentHosts = differentHosts;
	}
}
