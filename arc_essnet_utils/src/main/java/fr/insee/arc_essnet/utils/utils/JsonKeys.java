package fr.insee.arc_essnet.utils.utils;

public enum JsonKeys {
	//Requête
	CLIENT( "client" ),
	SERVICE( "service" ),

	//Service "query"
	REQUESTS( "requests" ),
	ID( "id" ), //Aussi utilisé dans les réponses quelque soit le service
	SQL( "sql" ),

	//Service "arcClient"
	REPRISE( "reprise" ),
	ENVIRONNEMENT( "environnement" ),
	FAMILLE( "familleNorme" ),
	VALINF( "validiteInf" ),
	VALSUP( "validiteSup" ),
	PERIODICITE( "periodicite" ),
    LIBELLELIBRE( "libelleLibre" ),
    NBFICHIERS("nbfichiers"),

	//Réponse
	RESPONSES( "responses" ),
	NOMENCLATURES( "nomenclatures" ),
	TABLEMETIER( "tableMetier" ),
	VARMETIER( "varMetier" ),
	TABLE( "table" );


	private String key;

	private JsonKeys( String name ){
		this.key = name;
	}



	public String getKey(){
		return this.key;
	}

}
