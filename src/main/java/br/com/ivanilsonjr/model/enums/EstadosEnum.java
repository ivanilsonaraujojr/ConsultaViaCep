package br.com.ivanilsonjr.model.enums;

public enum EstadosEnum {

		RO("RO","Rondônia"),
		AC("AC","Acre"),
		AM("AM","Amazonas"),
		RR("RR","Roraima"),
		PA("PA","Pará"),
		AP("AP","Amapá"),
		TO("TO","Tocantins"),
		MA("MA","Maranhão"),
		PI("PI","Piauí"),
		CE("CE","Ceará"),
		RN("RN","Rio Grande do Norte"),
		PB("PB","Paraíba"),
		PE("PE","Pernambuco"),
		AL("AL","Alagoas"),
		SE("SE","Sergipe"),
		BA("BA","Bahia"),
		MG("MG","Minas Gerais"),
		ES("ES","Espírito Santo"),
		RJ("RJ","Rio de Janeiro"),
		SP("SP","São Paulo"),
		PR("PR","Paraná"),
		SC("SC","Santa Catarina"),
		RS("RS","Rio Grande do Sul"),
		MS("MS","Mato Grosso do Sul"),
		MT("MT","Mato Grosso"),
		GO("GO","Goiás"),
		DF("DF","Distrito Federal");

		private final String uf;
		private final String nome;

		private EstadosEnum(String uf ,String nome) {
			this.uf = uf;
			this.nome = nome;
		}
		
		public String getNome(){
			return nome;
		}
		
		public String getUf() {
			return uf;
		}
		
		public static String conveterNome(String uf) {
			return findByUf(uf).getNome();
		}
		
		private static EstadosEnum findByUf(String uf) {
			for (EstadosEnum x : EstadosEnum.values()) {
				if (uf.equals(x.getUf())) {
					return x;
				}
			}
			return null;
		}

}
