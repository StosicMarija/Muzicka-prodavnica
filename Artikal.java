package dvadesetprvidomaci;

	public abstract class Artikal {
		private int id, kolicina;
		private static int globaID = 1;
		private double cena;

		public Artikal(double cena, int kolicina) {
			this.kolicina = kolicina;
			this.cena = cena;
			id = globaID++;
		}

		public int getId() {
			return id;
		}

		public int getKolicina() {
			return kolicina;
		}

		public double getCena() {
			return cena;
		}

		public abstract String ime();

		public boolean kupi() {
			if (kolicina > 0) {
				kolicina--;
				return true;
			} else
				return false;
		}

		
		@Override
		public String toString() {
			return "#" + id + ": " + ime() + " - " + cena + " [kol: " + kolicina + "]";
		}

	}

