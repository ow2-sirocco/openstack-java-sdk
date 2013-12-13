package com.woorea.openstack.quantum.api;


import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.quantum.model.BagpipeNetworkAction.AssociateVpnProfileAction;
import com.woorea.openstack.quantum.model.BagpipeNetworkAction.DissociateVpnProfileAction;
import com.woorea.openstack.quantum.model.Network;
import com.woorea.openstack.quantum.model.NetworkForCreate;
import com.woorea.openstack.quantum.model.Networks;

public class NetworksResource {

	private final OpenStackClient CLIENT;

	public NetworksResource(OpenStackClient client) {
		CLIENT = client;
	}

	public List list() {
		return new List();
	}

	public Create create(NetworkForCreate net){
		return new Create(net);
	}

	public Delete delete(String netId){
		return new Delete(netId);
	}

	public Show show(String netId){
		return new Show(netId);
	}

	public class List extends OpenStackRequest<Networks> {

		public List() {
		    super(CLIENT, HttpMethod.GET, "networks", null, Networks.class);
		}
	}

	public class Query extends OpenStackRequest<Networks> {

		public Query(Network network) {
			//super(network);
//			target = target.path("v2.0").path("networks");
//			target = queryParam(target);
//			return target.request(MediaType.APPLICATION_JSON).get(Networks.class);
		}
	}


	public class Create extends OpenStackRequest<Network> {

		public Create(NetworkForCreate net){
		    super(CLIENT, HttpMethod.POST, "networks", Entity.json(net), Network.class);
		}
	}

	public class Show extends OpenStackRequest<Network> {

		public Show(String id) {
		    super(CLIENT, HttpMethod.GET, buildPath("networks/", id), null, Network.class);
		}
	}

	public class Delete extends OpenStackRequest<Void> {

		public Delete(String id){
		    super(CLIENT, HttpMethod.DELETE, buildPath("networks/", id), null, Void.class);
		}
	}
	
	//
	// BaGPipe
	//

	public  class AssociateVpnProfileRequest extends OpenStackRequest<Void> {

		public AssociateVpnProfileRequest(String networkId, final AssociateVpnProfileAction associateVpnProfileAction) {
			super(CLIENT, HttpMethod.POST, new StringBuilder("/networks/").append(networkId).append("/action"), Entity.json(associateVpnProfileAction), Void.class);
		}

	}

	public  class DissociateVpnProfileRequest extends OpenStackRequest<Void> {

		public DissociateVpnProfileRequest(String networkId, final DissociateVpnProfileAction dissociateVpnProfileAction) {
			super(CLIENT, HttpMethod.POST, new StringBuilder("/networks/").append(networkId).append("/action"), Entity.json(dissociateVpnProfileAction), Void.class);
		}

	}

	public AssociateVpnProfileRequest associateVpnProfile(String networkId, String vpnprofileId) {
		AssociateVpnProfileAction associateVpnProfileAction = new AssociateVpnProfileAction();
		associateVpnProfileAction.setVpnprofileId(vpnprofileId);
		return new AssociateVpnProfileRequest(networkId, associateVpnProfileAction);
	}

	public DissociateVpnProfileRequest dissociateVpnProfile(String networkId, String vpnprofileId) {
		DissociateVpnProfileAction dissociateVpnProfileAction = new DissociateVpnProfileAction();
		dissociateVpnProfileAction.setVpnprofileId(vpnprofileId);
		return new DissociateVpnProfileRequest(networkId, dissociateVpnProfileAction);
	}
}
