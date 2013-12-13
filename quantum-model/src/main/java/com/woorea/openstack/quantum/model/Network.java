package com.woorea.openstack.quantum.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName("network")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Network implements Serializable{
	
	public static final class VpnProfile implements Serializable {
		
		public static final class VpnTenant implements Serializable {
			@JsonProperty("tenant_id")
			private String tenantId;
			private Integer id;
			private String name;
			
			/**
			 * @return the tenantId
			 */
			public String getTenantId() {
				return tenantId;
			}
			
			/**
			 * @param tenantId the tenantId to set
			 */
			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}
			
			/**
			 * @return the id
			 */
			public Integer getId() {
				return id;
			}
			
			/**
			 * @param id the id to set
			 */
			public void setId(Integer id) {
				this.id = id;
			}
			
			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}
			
			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}

			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "VpnTenant [tenantId=" + tenantId + ", id=" + id
						+ ", name=" + name + "]";
			}
		}
		
		public static final class NetworkDesc implements Serializable {
			private String id;
			private String name;
			
			/**
			 * @return the id
			 */
			public String getId() {
				return id;
			}
			
			/**
			 * @param id the id to set
			 */
			public void setId(String id) {
				this.id = id;
			}
			
			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}
			
			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}
			
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "NetworkDesc [id=" + id + ", name=" + name + "]";
			}
		}
		
		@JsonProperty("import_rt")
		private String importRt;
		private String name;
		@JsonProperty("export_rt")
		private String exportRt;
		@JsonProperty("vpn_type")
		private String vpnType;
		@JsonProperty("default")
		private boolean def;
		@JsonProperty("vpntenants")
		private List<VpnTenant> vpnTenants;
		private String id;
		private List<NetworkDesc> networks;
		
		/**
		 * @return the importRt
		 */
		public String getImportRt() {
			return importRt;
		}
		
		/**
		 * @param importRt the importRt to set
		 */
		public void setImportRt(String importRt) {
			this.importRt = importRt;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the exportRt
		 */
		public String getExportRt() {
			return exportRt;
		}

		/**
		 * @param exportRt the exportRt to set
		 */
		public void setExportRt(String exportRt) {
			this.exportRt = exportRt;
		}

		/**
		 * @return the vpnType
		 */
		public String getVpnType() {
			return vpnType;
		}

		/**
		 * @param vpnType the vpnType to set
		 */
		public void setVpnType(String vpnType) {
			this.vpnType = vpnType;
		}

		/**
		 * @return the def
		 */
		public boolean isDef() {
			return def;
		}

		/**
		 * @param def the def to set
		 */
		public void setDef(boolean def) {
			this.def = def;
		}

		/**
		 * @return the vpnTenants
		 */
		public List<VpnTenant> getVpnTenants() {
			return vpnTenants;
		}

		/**
		 * @param vpnTenants the vpnTenants to set
		 */
		public void setVpnTenants(List<VpnTenant> vpnTenants) {
			this.vpnTenants = vpnTenants;
		}

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}

		/**
		 * @return the networks
		 */
		public List<NetworkDesc> getNetworks() {
			return networks;
		}

		/**
		 * @param networks the networks to set
		 */
		public void setNetworks(List<NetworkDesc> networks) {
			this.networks = networks;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "VpnProfile [importRt=" + importRt + ", name=" + name
					+ ", exportRt=" + exportRt + ", vpnType=" + vpnType
					+ ", def=" + def + ", vpnTenants=" + vpnTenants + ", id="
					+ id + ", networks=" + networks + "]";
		}		
	}
	
	private String status;
	private List<String> subnets;
	private String name;
	@JsonProperty("provider:physical_network")
	private String providerPhyNet;
	@JsonProperty("admin_state_up")
	private boolean adminStateUp;
	@JsonProperty("tenant_id")
	private String tenantId;
	@JsonProperty("provider:network_type")
	private String netType;
	@JsonProperty("router:external")
	private String routerExternal;
	private String id;
	private String shared;
	@JsonProperty("provider:segmentation_id")
	private String providerSegID;
	@JsonProperty("bagpipe:default_vpnprofile")
	private VpnProfile defaultVpnProfile;
	@JsonProperty("bagpipe:vpnprofiles")
	private List<VpnProfile> vpnProfiles;
	

	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}



	/**
	 * @return the subnets
	 */
	public List<String> getSubnets() {
		return subnets;
	}



	/**
	 * @param subnets the subnets to set
	 */
	public void setSubnets(List<String> subnets) {
		this.subnets = subnets;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the providerPhyNet
	 */
	public String getProviderPhyNet() {
		return providerPhyNet;
	}



	/**
	 * @param providerPhyNet the providerPhyNet to set
	 */
	public void setProviderPhyNet(String providerPhyNet) {
		this.providerPhyNet = providerPhyNet;
	}



	/**
	 * @return the adminStateUp
	 */
	public boolean isAdminStateUp() {
		return adminStateUp;
	}



	/**
	 * @param adminStateUp the adminStateUp to set
	 */
	public void setAdminStateUp(boolean adminStateUp) {
		this.adminStateUp = adminStateUp;
	}



	/**
	 * @return the tenantId
	 */
	public String getTenantId() {
		return tenantId;
	}



	/**
	 * @param tenantId the tenantId to set
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}



	/**
	 * @return the netType
	 */
	public String getNetType() {
		return netType;
	}



	/**
	 * @param netType the netType to set
	 */
	public void setNetType(String netType) {
		this.netType = netType;
	}



	/**
	 * @return the routerExternal
	 */
	public String getRouterExternal() {
		return routerExternal;
	}



	/**
	 * @param routerExternal the routerExternal to set
	 */
	public void setRouterExternal(String routerExternal) {
		this.routerExternal = routerExternal;
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}



	/**
	 * @return the shared
	 */
	public String getShared() {
		return shared;
	}



	/**
	 * @param shared the shared to set
	 */
	public void setShared(String shared) {
		this.shared = shared;
	}



	/**
	 * @return the providerSegID
	 */
	public String getProviderSegID() {
		return providerSegID;
	}



	/**
	 * @param providerSegID the providerSegID to set
	 */
	public void setProviderSegID(String providerSegID) {
		this.providerSegID = providerSegID;
	}



	/**
	 * @return the defaultVpnProfile
	 */
	public VpnProfile getDefaultVpnProfile() {
		return defaultVpnProfile;
	}



	/**
	 * @param defaultVpnProfile the defaultVpnProfile to set
	 */
	public void setDefaultVpnProfile(VpnProfile defaultVpnProfile) {
		this.defaultVpnProfile = defaultVpnProfile;
	}



	/**
	 * @return the vpnProfiles
	 */
	public List<VpnProfile> getVpnProfiles() {
		return vpnProfiles;
	}



	/**
	 * @param vpnProfiles the vpnProfiles to set
	 */
	public void setVpnProfiles(List<VpnProfile> vpnProfiles) {
		this.vpnProfiles = vpnProfiles;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Network [status=" + status + ", subnets=" + subnets + ", name="
				+ name + ", providerPhyNet=" + providerPhyNet
				+ ", adminStateUp=" + adminStateUp + ", tenantId=" + tenantId
				+ ", netType=" + netType + ", routerExternal=" + routerExternal
				+ ", id=" + id + ", shared=" + shared + ", providerSegID="
				+ providerSegID + ", defaultVpnProfile=" + defaultVpnProfile
				+ ", vpnProfiles=" + vpnProfiles + "]";
	}


}
