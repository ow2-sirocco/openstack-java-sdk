package com.woorea.openstack.quantum.model;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

public interface BagpipeNetworkAction extends Serializable {

	
	@JsonRootName("associate_vpnprofile")
	public static final class AssociateVpnProfileAction implements BagpipeNetworkAction {
		
		@JsonProperty("vpnprofile_id")
		private String vpnprofileId;

		/**
		 * @return the vpnprofileId
		 */
		public String getVpnprofileId() {
			return vpnprofileId;
		}

		/**
		 * @param vpnprofileId the vpnprofileId to set
		 */
		public void setVpnprofileId(String vpnprofileId) {
			this.vpnprofileId = vpnprofileId;
		}
		
	}
	
	@JsonRootName("dissociate_vpnprofile")
	public static final class DissociateVpnProfileAction implements BagpipeNetworkAction {
		
		@JsonProperty("vpnprofile_id")
		private String vpnprofileId;

		/**
		 * @return the vpnprofileId
		 */
		public String getVpnprofileId() {
			return vpnprofileId;
		}

		/**
		 * @param vpnprofileId the vpnprofileId to set
		 */
		public void setVpnprofileId(String vpnprofileId) {
			this.vpnprofileId = vpnprofileId;
		}
		
	}
}
