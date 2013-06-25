package org.openstack.examples;

import org.openstack.base.client.OpenStackSimpleTokenProvider;
import org.openstack.keystone.Keystone;
import org.openstack.keystone.model.Tenant;

public class ExamplesConfiguration {

	/*public static final String KEYSTONE_AUTH_URL = "http://identity/v2.0";
	
	public static final String KEYSTONE_USERNAME = "";
	
	public static final String KEYSTONE_PASSWORD = "";

	public static final String NOVA_ENDPOINT = "http://compute/v2";
	
	public static final String TENANT_NAME = "admin";*/
	
	public static final String KEYSTONE_ENDPOINT = "http://keystone/v2.0";
	
	public static final String CEILOMETER_ENDPOINT = "";
	
    // -- Lannion v1
    /*public static final String KEYSTONE_AUTH_URL = "http://10.194.138.42:5000/v2.0";
    //public static final String KEYSTONE_USERNAME = "lov_admin";
    public static final String KEYSTONE_USERNAME = "lov_user";
    public static final String KEYSTONE_PASSWORD = "20130305";
    
    public static final String NOVA_ENDPOINT = "http://10.194.138.42:8774/v2";*/
	
    // -- Lannion v2   !!!! http://10.192.133.191  vs.  http://10.192.133.101  !!!!
    public static final String KEYSTONE_AUTH_URL = "http://10.192.133.101:5000/v2.0";
    //public static final String KEYSTONE_USERNAME = "lov_admin";
    public static final String KEYSTONE_USERNAME = "lov_user";
    public static final String KEYSTONE_PASSWORD = "lov_pass";
    
    public static final String NOVA_ENDPOINT = "http://10.192.133.101:8774/v2";
    
    public static final String TENANT_NAME = "lov_project";
	
    // -- Fred local
    /*public static final String KEYSTONE_AUTH_URL = "http://10.193.137.119:5000/v2.0";
    //public static final String KEYSTONE_USERNAME = "admin";
    public static final String KEYSTONE_USERNAME = "demo";
    public static final String KEYSTONE_PASSWORD = "password";
    
    public static final String NOVA_ENDPOINT = "http://10.193.137.119:8774/v2";
    
    public static final String TENANT_NAME = "XXXXXXX";*/
	
    // -- enocloud
    /*public static final String KEYSTONE_AUTH_URL = "http://ca.enocloud.com:5000/v2.0";
    public static final String KEYSTONE_USERNAME = "frederic.dangtran";
    public static final String KEYSTONE_PASSWORD = "veg3N66nYtLqnw2";
    
    public static final String NOVA_ENDPOINT = "http://198.154.188.142:8774/v2";
    
    public static final String TENANT = "XXXXXXX";*/

	
	public static void main(String[] args) {
		Keystone client = new Keystone(KEYSTONE_ENDPOINT);
		client.setTokenProvider(new OpenStackSimpleTokenProvider("secret0"));
		client.tenants().delete("36c481aec1d54fc49190c92c3ef6840a").execute();
		Tenant tenant = client.tenants().create(new Tenant("new_api")).execute();
		System.out.println(tenant);
		System.out.println(client.tenants().list().execute());
		client.tenants().delete(tenant.getId()).execute();
	}
	
}
