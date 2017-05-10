package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource("classpath*:context.xml")
//@EnableScheduling
public class SerializeUtilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerializeUtilsApplication.class, args);
//
//
////		try {
////			/* Start of Fix */
////			TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
////				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
////					return null;
////				}
////
////				public void checkClientTrusted(X509Certificate[] certs, String authType) {
////				}
////
////				public void checkServerTrusted(X509Certificate[] certs, String authType) {
////				}
////
////			}};
////
////			SSLContext sc = SSLContext.getInstance("SSL");
////			sc.init(null, trustAllCerts, new java.security.SecureRandom());
////			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
////
////			// Create all-trusting host name verifier
////			HostnameVerifier allHostsValid = new HostnameVerifier() {
////				public boolean verify(String hostname, SSLSession session) {
////					return true;
////				}
////			};
////			// Install the all-trusting host verifier
////			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
////			/* End of the fix*/
////		} catch (Exception e) {
////
////		}
//
//////		ApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
////////		Hideme hideme = (Hideme) ctx.getBean("hideme");
//////		int a =1 ;
////
////
//////		ApplicationContext ctx = new AnnotationConfigApplicationContext(SerializeUtilsApplication.class);
//////		Hideme hideme = (Hideme) ctx.getBean("hideme");
//////		int a=1;
////		JSONObject jsonObject = new JSONObject();
//////		List<String> urls = new ArrayList<>();
//////		urls.add("http://hideme.ru/proxy-list/?maxtime=1000&type=hs&anon=234#list");
//////		urls.add("http://hideme.ru/proxy-list/?maxtime=1000&type=hs&anon=234&start=64#list");
//////		jsonObject.put("urls", urls);
////		String url;
//////		url = "http://incloak.com/proxy-list/?maxtime=1400&type=s45&anon=234#list";
//////		url = "http://incloak.com/proxy-list/?maxtime=1400&type=s45&anon=234&start=64#list";
////		url = "http://incloak.com/proxy-list/?maxtime=1400&type=s45&anon=234&start=128#list";
////		jsonObject.put("url", url);
////
////		byte[] date = SerializationUtils.serialize(jsonObject);
////		FileOutputStream fos = null;
////		try {
////			fos = new FileOutputStream("pathname");
////			fos.write(date);
////			fos.close();
////		} catch (FileNotFoundException e) {
////			e.printStackTrace();
////		} catch (IOException e) {
////			e.printStackTrace();
////		}
////
////		int a=1;
//
//
////		while (true) {
//			try {
////			Document doc = Jsoup.connect("https://google.com") //http://myip.ru/ //https://google.com/
//////					.proxy(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("172.97.42.250", 45554)))
//////					.proxy(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved("89.163.224.61", 3128)))
////					.proxy("84.209.187.186", 45554)
////					.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
////					.header("Content-Language", "en-US")
////					.timeout(10000)
////					.get();
//
////			SocketAddress addr = new InetSocketAddress("66.253.248.168", 45554);
////			Proxy proxy = new Proxy(Proxy.Type.SOCKS, addr);
////			Socket socket = new Socket(proxy);
////			InetSocketAddress dest = new InetSocketAddress("https://google.com", 80);
////			socket.connect(dest);
////			socket.getInputStream();
//
////			Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
//
////			SocketAddress addr = new InetSocketAddress("111.1.23.140", 45554);
////			Proxy proxy = new Proxy(Proxy.Type.SOCKS, addr);
//
////			URL url = new URL("http://213.171.46.186:3128");
////			URLConnection conn = url.openConnection();
////			conn.connect();
//
////			URL url = new URL("https://google.com");
////			URL url = new URL("https://vk.com");
////			URL url = new URL("https://yahoo.com/");
////			URL url = new URL("http://aromaticos.ru");
////			URL url = new URL("https://ya.ru");
////			URL url = new URL("https://youtube.com");
////			URL url = new URL("https://www.mbet.es");
////			URL url = new URL("https://www.bwin.com");
//			URL url = new URL("http://www.incloak.com");
////			URL url = new URL("https://lifehacker.ru");
////			URL url = new URL("https://giryaev.com");
////			URL url = new URL("https://www.spark.ru");
////			URL url = new URL("https://www.marathonbet.com");
//				//для http https URLConnection conn = url.openConnection(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved("89.163.224.61", 3128)));
//				//System.setProperty("socksProxyVersion", "5");
////			String ip = "50.140.180.177";
//				String ip = "178.157.210.48";
//				int port = 45554;
//
//				URLConnection conn = url.openConnection(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(ip, port)));
////				URLConnection conn = url.openConnection(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(ip, port)));
//				conn.addRequestProperty("User-Agent",
//						"Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0");
////				conn.addRequestProperty("Content-Language", "ru-RU");
//				conn.addRequestProperty("Accept", "text/html");
//
//				// get the cookie if need, for login
////				String cookies = conn.getHeaderField("Set-Cookie");
//				conn.setRequestProperty("Cookie", "");
//
//				conn.addRequestProperty("Referer", "google.com");
//				conn.setConnectTimeout(2000);
//
//				BufferedReader in = null;
//
//				long startTimeMillis = System.currentTimeMillis();
//
//				while (true) {
//					try {
//						conn.setReadTimeout(15000);
//						conn.connect();
//						in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//						break;
//
//					} catch (Exception e) {
//
//						if(System.currentTimeMillis() - startTimeMillis > 20000) {
//							System.out.println("Timeout");
//							return;
//						}
//						e.printStackTrace();
//						System.out.println("brak!");
//					}
//				}
//
////			Object o = conn.getContent();
//
//
//				StringBuffer sb = new StringBuffer();
//				String inputLine;
//
//				while ((inputLine = in.readLine()) != null)
////				System.out.println(inputLine);
//					sb.append(inputLine);
//				in.close();
//
//				System.out.println("SUCCESS");
//				int a = 1;
//			} catch (Exception e) {
//				e.printStackTrace();
//				int a = 1;
//			}
////		}
	}
}
