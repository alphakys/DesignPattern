package creation;


public class Computer {
	
	private int serialNumber, ram, disk;
	private String model, vender, cpu, graphicCard;
	
	static {
		System.out.println("스태틱");
	}
	
	{System.out.println("인스턴스");}
	
	
	Computer(int serialNumber, int ram, int disk, String model, String vender, String cpu, String graphicCard){
		this.cpu = cpu;
		this.disk = disk;
		this.graphicCard = graphicCard;
		this.model = model;
		this.ram = ram;
		this.serialNumber = serialNumber;
		this.vender = vender;
	}
	
	public Computer setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}
	
	public Computer setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public Computer setDisk(int disk) {
		this.disk = disk;
		return this;
	}
	
	public Computer setVender(String vender) {
		this.vender = vender;
		return this;
	}
	
	public Computer setCpu(String cpu) {
		
		this.cpu = cpu;
		return this;
	}
	
	public Computer setGraphicCard(String graphicCard) {
		this.graphicCard = graphicCard;
		return this;
	}
	
	@Override
	public String toString() {
		return "Computer [serialNumber=" + serialNumber + ", ram=" + ram + ", disk=" + disk + ", model=" + model
				+ ", vender=" + vender + ", cpu=" + cpu + ", graphicCard=" + graphicCard + "]";
	}

	
	
	public static class computerBuilder{
		
		private int serialNumber, ram, disk;
		private String model, vender, cpu, graphicCard;
		
		public computerBuilder setSerialNumber(int serialNumber) {
			this.serialNumber = serialNumber;
			return this;
		}
		
		public computerBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}
		
		public computerBuilder setDisk(int disk) {
			this.disk = disk;
			return this;
		}
		
		public computerBuilder setVender(String vender) {
			this.vender = vender;
			return this;
		}
		
		public computerBuilder setCpu(String cpu) {
			
			this.cpu = cpu;
			return this;
		}
		
		public computerBuilder setGraphicCard(String graphicCard) {
			this.graphicCard = graphicCard;
			return this;
		}
		
		
		public Computer build() {
			
			return new Computer(serialNumber, ram, disk, model, vender, cpu, graphicCard);
		}
	
	}
	
	public static void main(String[] args) {
		
		Computer com = new Computer.computerBuilder().setCpu("intel").setGraphicCard("gforce").build();
		
		System.out.println(com.toString());
	
				

		
	}
}
