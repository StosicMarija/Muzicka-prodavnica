package dvadesetprvidomaci;

import sedamnaestidomaci.Album;

public abstract class AlbumArtikal extends Artikal {

		protected String izdavac;
		protected Album album;

		public AlbumArtikal(Album album, String izdavac, double cena, int kolicina) {
			super(cena, kolicina);
			this.album = album;
			this.izdavac = izdavac;
		}

	}


