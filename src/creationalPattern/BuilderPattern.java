package creationalPattern;


public class BuilderPattern {
	
	private int ram, ssd; 
	private String cpu, graphicCard;
	
	BuilderPattern(int ram, int ssd, String cpu, String graphicCard){
		this.ram = ram;
		this.ssd = ssd;
		this.cpu = cpu;
		this.graphicCard = graphicCard;
	}
		
	
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", ssd=" + ssd + ", cpu=" + cpu + ", graphicCard=" + graphicCard + "]";
	}


	private static class ComputerBuilder {
		
		private int ram, ssd;
		private String cpu, graphicCard = "";
		
		public ComputerBuilder() {
			
		}
		
		public ComputerBuilder(int ram, int ssd) {
			this.ram = ram;
			this.ssd = ssd;
		}
		
		
		public ComputerBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}
		
		public ComputerBuilder setSsd(int ssd) {
			this.ssd = ssd;
			return this;
		}
		
		public ComputerBuilder setCpu(String cpu) {
			this.cpu = cpu;
			return this;
		}
		
		public ComputerBuilder setGraphicCard(String graphicCard) {
			this.graphicCard = graphicCard;
			return this;
		}
		
		public BuilderPattern build() {
			
			return new BuilderPattern(ram, ssd, cpu, graphicCard);
		}
		
	}
	
	public static void main(String args[]) {
		//1번 방식
		BuilderPattern c = new BuilderPattern.ComputerBuilder()
				.setGraphicCard("nvdia")
				.setRam(8)
				.setSsd(256)
				.build();
		
		//2번 방식
		BuilderPattern c2 = new BuilderPattern.ComputerBuilder(8, 512)
				.setGraphicCard("nvdia")
				.build();
		
		
		System.out.println(c2.toString());
	}
	
	
	
}
