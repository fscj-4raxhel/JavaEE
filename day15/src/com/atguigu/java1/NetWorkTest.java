package com.atguigu.java1;

/*
 * 接口的应用:代理模式
 */
public class NetWorkTest {
	public static void main(String[] args) {

		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		
		proxyServer.browse();
	}
}

interface NetWork {

	public void browse();
}

// 被代理类
class Server implements NetWork {

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("真是的服务器访问网络");
	}

}

// 代理类
class ProxyServer implements NetWork {

	private NetWork work;

	public ProxyServer(NetWork work) {
		this.work = work;
	}

	public void check() {
		System.out.println("联网之前的检查工作");
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		check();
		work.browse();
	}

}