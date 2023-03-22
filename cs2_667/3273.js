int, int, int calculatenumPlayersModifier_3273() {
	int difficultyBonus;
	int difficulty;
	int numPlayers;
	difficultyBonus = 0;
	difficulty = VARC[1191] / 10;
	numPlayers = VARC[1191] - VARC[1191] / 10 * 10;
	switch (difficulty) {
		case 1:
			switch (numPlayers) {
				case 1:
					difficultyBonus = 0;
					break;
			}
			break;
		case 2:
			switch (numPlayers) {
				case 1:
					difficultyBonus = -760;
					break;
				case 2:
					difficultyBonus = 507;
					break;
			}
			break;
		case 3:
			switch (numPlayers) {
				case 1:
					difficultyBonus = -1520;
					break;
				case 2:
					difficultyBonus = 190;
					break;
				case 3:
					difficultyBonus = 950;
					break;
			}
			break;
		case 4:
			switch (numPlayers) {
				case 1:
					difficultyBonus = -2280;
					break;
				case 2:
					difficultyBonus = -760;
					break;
				case 3:
					difficultyBonus = 633;
					break;
				case 4:
					difficultyBonus = 1457;
					break;
			}
			break;
		case 5:
			switch (numPlayers) {
				case 1:
					difficultyBonus = -3040;
					break;
				case 2:
					difficultyBonus = -1267;
					break;
				case 3:
					difficultyBonus = 380;
					break;
				case 4:
					difficultyBonus = 1140;
					break;
				case 5:
					difficultyBonus = 1900;
					break;
			}
			break;
	}
	return difficulty, numPlayers, difficultyBonus;
}