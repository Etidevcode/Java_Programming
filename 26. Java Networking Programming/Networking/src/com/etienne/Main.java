package com.etienne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		try {
			// URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
			// URI uri = new URI("hello");
			// URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
			/*URI uri = new URI("/catalogue/phones?os=android#samsung");
			URL url = uri.toURL();
			System.out.println("URL = " + url);*/


			/*
			System.out.println("Scheme = " + uri.getScheme());
			System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
			System.out.println("Authority = " + uri.getAuthority());
			System.out.println("User Info = " + uri.getUserInfo());
			System.out.println("Host = " + uri.getHost());
			System.out.println("Port = " + uri.getPath());
			System.out.println("Path = " + uri.getPath());
			System.out.println("Query = " + uri.getQuery());
			System.out.println("Fragment = " + uri.getFragment());

			*/


			/*URI baseUri = new URI("http://username:password@mynewserver.com:5000");
			URI uri1 = new URI("/catalogue/phones?os=android#samsung");
			URI uri2 = new URI("/catalogue/tvs?manufacture=samsung");
			URI uri3 = new URI("/stores/locations?zip=1234");

			URI resolveUri1 = baseUri.resolve(uri1);
			URI resolveUri2 = baseUri.resolve(uri2);
			URI resolveUri3 = baseUri.resolve(uri3);

			URL url1 = resolveUri1.toURL();
			System.out.println("URL 1 = " + url1);
			URL url2 = resolveUri2.toURL();
			System.out.println("URL 2 = " + url2);
			URL url3 = resolveUri3.toURL();
			System.out.println("URL 3 = " + url3);

			URI relativizedURI = baseUri.relativize(resolveUri2);
			System.out.println("Relative URI = " + relativizedURI);

		} catch (URISyntaxException e) {
			System.out.println("URI Bad syntax: " + e.getMessage());
		}*/




			/*
			URL url = new URL("http://example.org");
			URI uri = url.toURI();

			System.out.println("Scheme = " + uri.getScheme());
			System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
			System.out.println("Authority = " + uri.getAuthority());
			System.out.println("User Info = " + uri.getUserInfo());
			System.out.println("Host = " + uri.getHost());
			System.out.println("Port = " + uri.getPath());
			System.out.println("Path = " + uri.getPath());
			System.out.println("Query = " + uri.getQuery());
			System.out.println("Fragment = " + uri.getFragment());
		} catch (URISyntaxException e) {
				System.out.println("URI Bad syntax: " + e.getMessage());*/

			// URL url = new URL("http://example.org/somepage.html");
			URL url = new URL("https://api.flickr.com/services/feeds/photos_public.gne?tags=cats");
			/*URLConnection urlConnection = url.openConnection();
			urlConnection.setDoOutput(true);
			urlConnection.connect();*/

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("User-Agent", "Chrome");
			connection.setReadTimeout(30000);

			int responseCode = connection.getResponseCode();
			System.out.println("Response code: " + responseCode);

			if (responseCode != 200) {
				System.out.println("Error reading web page");
				System.out.println(connection.getResponseMessage());
				return;
			}

			BufferedReader inputReader = new BufferedReader( // inputStream
					new InputStreamReader(url.openStream()));

			String line;
			while ((line = inputReader.readLine()) != null) {
				System.out.println(line);
			}

			inputReader.close();
			/*String line = "";
			while ((line != null)) {
				line = inputStream.readLine();
				System.out.println(line);
			}
			inputStream.close();*/

			/*Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
			for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
				String key = entry.getKey();
				List<String> value = entry.getValue();
				System.out.println("------key = " + key);
				for (String string : value) {
					System.out.println("value = " + value);
				}
			}*/

		} catch (MalformedURLException e) {
			System.out.println("Malformed URL: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}
}
