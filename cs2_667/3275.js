int getGuideModeDivider_3275() {
	if (VARC[1196] == 1) {
		switch (VARC[1188]) {
			case 3:
				return 9500;
			case 2:
				return 9500;
		}
		return 9500;
	}
	return 10000;
}