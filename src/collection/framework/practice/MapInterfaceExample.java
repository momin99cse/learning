package collection.framework.practice;

import java.util.*;

public class MapInterfaceExample {
	
	
	public static void main(String args[]){
		
		Map<Integer,String> mapHttpErrors=new HashMap<>();
		
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		
		System.out.println(mapHttpErrors);
		
		Map<Integer,String> mapError=new HashMap<>(mapHttpErrors);
		
		System.out.println(mapError);
		
		
		Map<String, String> mapContacts =new LinkedHashMap<>();
		
		mapContacts.put("0169238175", "Tom");
		mapContacts.put("0904891321", "Peter");
		mapContacts.put("0945678912", "Mary");
		mapContacts.put("0981127421", "John");
		
		System.out.println(mapContacts);
		
		
		Map<String,String> mapLang =new TreeMap<>();
		
		mapLang.put(".c", "C");
		mapLang.put(".java", "Java");
		mapLang.put(".pl", "Perl");
		mapLang.put(".cs", "C#");
		mapLang.put(".php", "PHP");
		mapLang.put(".cpp", "C++");
		mapLang.put(".xml", "XML");
		
		System.out.println(mapLang);
		
		String mmm=mapHttpErrors.get(404);
		
		System.out.println(mmm);
		
		
		
		Map<String, String> mapCountryCodes=new HashMap<>();
		
		mapCountryCodes.put("1", "USA");
		mapCountryCodes.put("44", "United Kingdom");
		mapCountryCodes.put("33", "France");
		mapCountryCodes.put("81", "Japan");
		
		Set<String> setCodes=mapCountryCodes.keySet();
		
		
		Iterator<String> itr=setCodes.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		Collection<String> countries=mapCountryCodes.values();
		
		for(String country : countries) {
			System.out.println(country);
		}
		
		
		Set<Map.Entry<String, String>>  entries=mapCountryCodes.entrySet();
		
		for(Map.Entry<String, String> entry : entries) {
			
			String code=entry.getKey();
			String value=entry.getValue();
			
			System.out.println(code +" ==> "+ value);
			
		}
		
		
		Map<Integer, String> countryCodesEU=new HashMap<>();
		
		countryCodesEU.put(44, "United Kingdom");
		countryCodesEU.put(33, "France");
		countryCodesEU.put(49, "Germany");
		
		
		Map<Integer, String> countryCodesWorld=new HashMap<>();
		
		countryCodesWorld.put(1, "United States");
		countryCodesWorld.put(86, "China");
		countryCodesWorld.put(82, "South Korea");
		
		System.out.println("Before : " + countryCodesWorld);
		
		countryCodesWorld.putAll(countryCodesEU);
		
		System.out.println("After : " + countryCodesWorld);
		
		
		
		
	}

}
