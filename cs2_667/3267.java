class script_3267 {
	void script_3267() {
		int int0;
		int int1;
		int int2;
		int difficulty;
		int numPlayers;
		int retDifficultyBonus;
		int int6;
		int int7;
		int int8;
		int sizeBonus;
		int roomLevelMod;
		int difficultyBonus;
		int complexityDivider;
		int deathDivider;
		int0 = 0;
		int1 = 0;
		int2 = 0;
		difficulty = 0;
		numPlayers = 0;
		retDifficultyBonus = 0;
		int7 = 0;
		int8 = 0;
		VARC[1185] = max(VARC[1185] - 2, 0);
		widget(933, 251).setTrans(VARC[1185]);
		widget(933, 297).setTrans(255 - VARC[1185]);
		widget(933, 298).setTrans(255 - VARC[1185]);
		widget(933, 299).setTrans(255 - VARC[1185]);
		sizeBonus = 0;
		if (VARC[1188] == 2) {
			sizeBonus = 792;
		} else if (VARC[1188] == 3) {
			sizeBonus = 1583;
		}
		roomLevelMod = VARC[1195] * 10000 / 1267;
		difficulty, numPlayers, retDifficultyBonus = calculateDifficultyModifier_3273();
		difficultyBonus = retDifficultyBonus;
		complexityDivider = getComplexityDivider_3274();
		deathDivider = 10000 - min(VARPBIT[7554], 6) * 1000;
		if (VARC[1185] == 0 && VARC[1192] != 0) {
			if (VARC[1186] < 350) {
				if (widget(933, 186).getShadeColor() <= 31) {
					VARC[1189] = 7;
				} else if (widget(933, 186).getShadeColor() > 220) {
					VARC[1189] = -7;
				}
				widget(933, 186).setTrans(widget(933, 186).getShadeColor() + VARC[1189]);
			} else if (VARC[1186] >= 350 && VARC[1186] < 400) {
				if (VARC[1186] == 350) {
					widget(933, 186).setTrans(255);
				}
				if (widget(933, 37).getShadeColor() <= 31) {
					VARC[1189] = 7;
				} else if (widget(933, 37).getShadeColor() > 220) {
					VARC[1189] = -7;
				}
				widget(933, 37).setTrans(widget(933, 37).getShadeColor() + VARC[1189]);
			} else if (VARC[1186] >= 400 && VARC[1186] < 1350) {
				if (VARC[1186] == 400) {
					widget(933, 37).setTrans(255);
				}
				if (widget(933, 53).getShadeColor() <= 31) {
					VARC[1189] = 7;
				} else if (widget(933, 53).getShadeColor() > 220) {
					VARC[1189] = -7;
				}
				widget(933, 53).setTrans(widget(933, 53).getShadeColor() + VARC[1189]);
			} else if (VARC[1186] >= 1350 && VARC[1186] < 1600) {
				if (VARC[1186] == 1350) {
					widget(933, 53).setTrans(255);
				}
				if (widget(933, 37).getShadeColor() <= 31) {
					VARC[1189] = 7;
				} else if (widget(933, 37).getShadeColor() > 220) {
					VARC[1189] = -7;
				}
				widget(933, 37).setTrans(widget(933, 37).getShadeColor() + VARC[1189]);
			}
			if (VARC[1186] < 25) {
				widget(933, 192).setIsHidden(false);
				widget(933, 17).setIsHidden(false);
				if (VARC[1186] == 0) {
					playSoundEffect(8802, 1, 0);
				}
			} else if (VARC[1186] < 25 + 25) {
				widget(933, 187).setIsHidden(false);
				widget(933, 240).setIsHidden(false);
				if (VARC[1187] < VARC[1319]) {
					widget(933, 240).setText("Floor " + str(VARC[1187]) + ":");
					widget(933, 240).setRGB(0xA00000);
				} else {
					widget(933, 240).setText("Floor " + str(VARC[1319]) + ":");
				}
				widget(933, 22).setIsHidden(false);
				widget(933, 23).setSize(widget(933, 23).getWidth() + 5, widget(933, 23).getHeight() + 5, 0, 0);
				if (VARC[1186] == 25) {
					playSoundEffect(8802, 1, 0);
				}
				widget(933, 23).setTrans(min(255, widget(933, 23).getShadeColor() + 30));
			} else if (VARC[1186] < 25 + 25 + 50) {
				int8 = (VARC[1186] - (25 + 25) + 1) * 50 / 100;
				if (int8 == 0) {
					VARC[1270] = 0;
				}
				widget(933, 241).setIsHidden(false);
				widget(933, 241).setText(str((VARC[1237] + 5) / 10 * 100 / int8));
				if ((VARC[1237] + 5) / 10 * 100 / int8 != VARC[1270]) {
					playSoundEffect(8806, 1, 0);
					VARC[1270] = (VARC[1237] + 5) / 10 * 100 / int8;
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25) {
				widget(933, 190).setIsHidden(false);
				int8 = (VARC[1186] - (25 + 25 + 50) + 1) * 25 / 100;
				widget(933, 190).setTrans(255 - int8 * 255 / 100);
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25) {
				widget(933, 188).setIsHidden(false);
				widget(933, 227).setIsHidden(false);
				if (isMember()) {
					widget(933, 227).setText("Prestige " + str(min(60, max(VARPBIT[7550], VARPBIT[7551]))));
				} else {
					widget(933, 227).setText("Prestige " + str(min(35, max(VARPBIT[7550], VARPBIT[7551]))));
				}
				widget(933, 21).setIsHidden(false);
				widget(933, 24).setSize(widget(933, 24).getWidth() + 5, widget(933, 24).getHeight() + 5, 0, 0);
				if (VARC[1186] == 25 + 25 + 50 + 25) {
					playSoundEffect(8802, 1, 0);
				}
				widget(933, 24).setTrans(min(255, widget(933, 24).getShadeColor() + 30));
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50) {
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25) + 1) * 50 / 100;
				if (int8 == 0) {
					VARC[1270] = 0;
				}
				widget(933, 228).setIsHidden(false);
				widget(933, 228).setText(str((VARC[1238] + 5) / 10 * 100 / int8));
				if ((VARC[1238] + 5) / 10 * 100 / int8 != VARC[1270]) {
					playSoundEffect(8806, 1, 0);
					VARC[1270] = (VARC[1238] + 5) / 10 * 100 / int8;
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25) {
				widget(933, 191).setIsHidden(false);
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50) + 1) * 25 / 100;
				widget(933, 191).setTrans(255 - int8 * 255 / 100);
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25) {
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25) + 1) * 25 / 100;
				widget(933, 189).setIsHidden(false);
				widget(933, 214).setIsHidden(false);
				widget(933, 20).setIsHidden(false);
				widget(933, 25).setSize(widget(933, 25).getWidth() + 5, widget(933, 25).getHeight() + 5, 0, 0);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25) {
					playSoundEffect(8802, 1, 0);
				}
				widget(933, 25).setTrans(min(255, widget(933, 25).getShadeColor() + 30));
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50) {
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25) + 1) * 50 / 100;
				if (int8 == 0) {
					VARC[1270] = 0;
				}
				widget(933, 215).setIsHidden(false);
				widget(933, 215).setText(str((VARC[1239] + 5) / 10 * 100 / int8));
				if ((VARC[1239] + 5) / 10 * 100 / int8 != VARC[1270]) {
					playSoundEffect(8806, 1, 0);
					VARC[1270] = (VARC[1239] + 5) / 10 * 100 / int8;
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100) {
				widget(933, 186).setIsHidden(true);
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50) + 1) * 100 / 100;
				if (int8 == 0) {
					VARC[1270] = 0;
				}
				widget(933, 19).setIsHidden(false);
				widget(933, 39).setText(str((VARC[1239] + 5) / 10 * 100 / int8));
				if ((VARC[1239] + 5) / 10 * 100 / int8 != VARC[1270]) {
					playSoundEffect(9243, 1, 0);
					VARC[1270] = (VARC[1239] + 5) / 10 * 100 / int8;
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50) {
				widget(933, 37).setTrans(255);
				widget(933, 83).setIsHidden(false);
				widget(933, 18).setIsHidden(false);
				widget(933, 53).setIsHidden(false);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100) {
					playSoundEffect(8802, 1, 0);
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25) {
				widget(933, 54).setIsHidden(false);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50) {
					playSoundEffect(8802, 1, 0);
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150) {
				widget(933, 68).setIsHidden(false);
				widget(933, 69).setIsHidden(false);
				widget(933, 70).setIsHidden(false);
				widget(933, 71).setIsHidden(false);
				widget(933, 72).setIsHidden(false);
				widget(933, 73).setIsHidden(false);
				widget(933, 74).setIsHidden(false);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25) {
					playSoundEffect(8806, 1, 0);
				}
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150) {
					playSoundEffect(8802, 1, 0);
				}
				difficulty, numPlayers, retDifficultyBonus = calculateDifficultyModifier_3273();
				if (difficulty < 3) {
					widget(933, 82).setIsHidden(false);
				}
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25) + 1) * (150 / 3) / 100;
				if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 / 3) {
					if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 / 3) {
						playSoundEffect(8802, 1, 0);
					}
					widget(933, 68).setTrans(min(200, 255 - int8 * 255 / 100));
					widget(933, 74).setText("+0%");
					if (int8 == 0) {
						playSoundEffect(8806, 1, 0);
					}
					if (VARC[1186] == 475) {
						playSoundEffect(9241, 1, 0);
					}
				} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 / 3 * 2 && VARC[1188] > 1) {
					if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 / 3 * 2 && VARC[1188] > 1) {
						playSoundEffect(8802, 1, 0);
					}
					int0 = 10000;
					int1 = int0 + 792;
					if (int8 == 33) {
						VARC[1270] = int0;
						playSoundEffect(9241, 1, 0);
					}
					widget(933, 68).setTrans(min(200, int8 / 2 * 255 / 100));
					widget(933, 69).setTrans(min(200, 255 - int8 * 255 / 100));
					widget(933, 74).setText("+" + str((int8 * 100 / (int1 - 10000) / 2 + 50) / 100) + "%");
					if ((int8 * 100 / (int1 - 10000) / 2 + 50) / 100 != VARC[1270]) {
						playSoundEffect(8806, 1, 0);
						VARC[1270] = (int8 * 100 / (int1 - 10000) / 2 + 50) / 100;
					}
					widget(933, 96).setText(str((int0 + int8 * 100 / (int1 - int0) / 2 + 50) / 100) + "%");
					widget(933, 112).setSize(8192 * 100 / ((int0 + int8 * 100 / (int1 - int0) / 2 + 50) / 100), 16384, 2, 2);
					if (VARC[1186] == 525) {
						playSoundEffect(9241, 1, 0);
					}
				} else if (VARC[1188] > 2) {
					int0 = 10000 + 792;
					int1 = 10000 + 1583;
					if (int8 == 66) {
						VARC[1270] = int0;
						playSoundEffect(9241, 1, 0);
					}
					widget(933, 69).setTrans(min(200, int8 / 3 * 255 / 100));
					widget(933, 70).setTrans(min(200, 255 - int8 * 255 / 100));
					widget(933, 74).setText("+" + str((int8 * 100 / (int1 - 10000) / 3 + 50) / 100) + "%");
					if ((int8 * 100 / (int1 - 10000) / 3 + 50) / 100 != VARC[1270]) {
						playSoundEffect(8806, 1, 0);
						VARC[1270] = (int8 * 100 / (int1 - 10000) / 3 + 50) / 100;
					}
					widget(933, 96).setText(str((int0 + int8 * 100 / (int1 - int0) / 3 + 50) / 100) + "%");
					widget(933, 112).setSize(8192 * 100 / ((int0 + int8 * 100 / (int1 - int0) / 3 + 50) / 100), 16384, 2, 2);
					if (VARC[1186] == 575) {
						playSoundEffect(9241, 1, 0);
					}
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25) {
				widget(933, 55).setIsHidden(false);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150) {
					playSoundEffect(8802, 1, 0);
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100) {
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25) + 1) * 100 / 100;
				widget(933, 64).setIsHidden(false);
				widget(933, 75).setIsHidden(false);
				widget(933, 172).setSize(VARC[1195] * 10000 / 16384 * 100 / int8, 16384, 2, 2);
				int0 = 10000 + sizeBonus;
				int1 = 10000 + sizeBonus + roomLevelMod;
				if (int8 == 0) {
					VARC[1270] = int0;
				}
				if (int1 >= int0) {
					widget(933, 75).setText("+" + str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				} else {
					widget(933, 75).setText(str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				}
				widget(933, 96).setText(str((int0 + int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				if ((int0 + int8 * 100 / (int1 - int0) + 50) / 100 != VARC[1270]) {
					playSoundEffect(8806, 1, 0);
					VARC[1270] = (int0 + int8 * 100 / (int1 - int0) + 50) / 100;
				}
				widget(933, 112).setSize(8192 * 100 / ((int0 + int8 * 100 / (int1 - int0) + 50) / 100), 16384, 2, 2);
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25) {
				widget(933, 56).setIsHidden(false);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100) {
					playSoundEffect(8802, 1, 0);
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100) {
				widget(933, 57).setIsHidden(false);
				widget(933, 78).setIsHidden(false);
				widget(933, 80).setIsHidden(false);
				widget(933, 59).setIsHidden(false);
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25) + 1) * 100 / 100;
				widget(933, 78).setTrans(255 - int8 * 255 / 100);
				widget(933, 80).setTrans(255 - int8 * 255 / 100);
				difficulty, numPlayers, retDifficultyBonus = calculateDifficultyModifier_3273();
				widget(933, 57).setText(str(difficulty) + " : " + str(numPlayers));
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25) {
					playSoundEffect(8806, 1, 0);
				}
				int0 = 10000 + sizeBonus + roomLevelMod;
				int1 = 10000 + sizeBonus + roomLevelMod + difficultyBonus;
				if (int8 == 0) {
					VARC[1270] = int0;
				}
				if (int1 >= int0) {
					widget(933, 59).setText("+" + str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				} else {
					widget(933, 59).setText(str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				}
				widget(933, 96).setText(str((int0 + int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				if ((int0 + int8 * 100 / (int1 - int0) + 50) / 100 != VARC[1270]) {
					playSoundEffect(8806, 1, 0);
					VARC[1270] = (int0 + int8 * 100 / (int1 - int0) + 50) / 100;
				}
				widget(933, 112).setSize(8192 * 100 / ((int0 + int8 * 100 / (int1 - int0) + 50) / 100), 16384, 2, 2);
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25) {
				widget(933, 61).setIsHidden(false);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100) {
					playSoundEffect(8802, 1, 0);
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50) {
				widget(933, 76).setIsHidden(false);
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25) + 1) * 50 / 100;
				int0 = 10000 + sizeBonus + roomLevelMod + difficultyBonus;
				int1 = 10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236];
				if (int8 == 0) {
					VARC[1270] = int0;
				}
				if (int1 >= int0) {
					widget(933, 76).setText("+" + str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
					if ((int8 * 100 / (int1 - int0) + 50) / 100 != VARC[1270]) {
						playSoundEffect(8806, 1, 0);
						VARC[1270] = (int8 * 100 / (int1 - int0) + 50) / 100;
					}
				} else {
					widget(933, 76).setText(str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				}
				widget(933, 96).setText(str((int0 + int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				if ((int0 + int8 * 100 / (int1 - int0) + 50) / 100 != VARC[1270]) {
					playSoundEffect(8806, 1, 0);
					VARC[1270] = (int0 + int8 * 100 / (int1 - int0) + 50) / 100;
				}
				widget(933, 112).setSize(8192 * 100 / ((int0 + int8 * 100 / (int1 - int0) + 50) / 100), 16384, 2, 2);
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25) {
				widget(933, 62).setIsHidden(false);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50) {
					playSoundEffect(8802, 1, 0);
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50) {
				widget(933, 58).setIsHidden(false);
				widget(933, 79).setIsHidden(false);
				widget(933, 81).setIsHidden(false);
				widget(933, 60).setIsHidden(false);
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25) + 1) * 50 / 100;
				widget(933, 79).setTrans(255 - int8 * 255 / 100);
				widget(933, 81).setTrans(255 - int8 * 255 / 100);
				widget(933, 58).setText(str(VARC[1320] * 100 / int8));
				if (VARC[1320] * 100 / int8 != VARC[1270]) {
					playSoundEffect(8806, 1, 0);
					VARC[1270] = VARC[1320] * 100 / int8;
				}
				int0 = 10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236];
				int1 = (10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236]) * 10000 / complexityDivider;
				if (int1 >= int0) {
					widget(933, 60).setText("+" + str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				} else {
					widget(933, 60).setText(str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				}
				widget(933, 96).setText(str((int0 + int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				widget(933, 112).setSize(8192 * 100 / ((int0 + int8 * 100 / (int1 - int0) + 50) / 100), 16384, 2, 2);
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25) {
				widget(933, 63).setIsHidden(false);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50) {
					playSoundEffect(8802, 1, 0);
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25) {
				widget(933, 77).setIsHidden(false);
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25) + 1) * 25 / 100;
				int0 = (10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236]) * 10000 / complexityDivider;
				int1 = (10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236]) * 10000 / complexityDivider * 10000 / getGuideModeDivider_3275();
				if (int1 >= int0) {
					widget(933, 77).setText("+" + str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				} else {
					widget(933, 77).setText(str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				}
				widget(933, 96).setText(str((int0 + int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				widget(933, 112).setSize(8192 * 100 / ((int0 + int8 * 100 / (int1 - int0) + 50) / 100), 16384, 2, 2);
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25) {
				widget(933, 65).setIsHidden(false);
				if (VARC[1186] == 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25) {
					playSoundEffect(8802, 1, 0);
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25 + 150) {
				widget(933, 66).setIsHidden(false);
				widget(933, 67).setIsHidden(false);
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25) + 1) * 150 / 100;
				if (VARPBIT[7554] != 0) {
					int6, int7 = script_3266(VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25));
					if (int6 == 1) {
						playSoundEffect(9240, 1, 0);
						switch (int7) {
							case 0:
								widget(933, 146).setIsHidden(false);
								widget(933, 146).setSprite(2849);
								break;
							case 1:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 146).setSprite(2850);
								widget(933, 147).setSprite(2849);
								break;
							case 2:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 147).setSprite(2850);
								widget(933, 148).setSprite(2849);
								break;
							case 3:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 148).setSprite(2850);
								widget(933, 149).setSprite(2849);
								break;
							case 4:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 149).setSprite(2850);
								widget(933, 150).setSprite(2849);
								break;
							case 5:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 150).setSprite(2850);
								widget(933, 151).setSprite(2849);
								break;
							case 6:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 152).setIsHidden(false);
								widget(933, 151).setSprite(2850);
								widget(933, 152).setSprite(2849);
								break;
							case 7:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 152).setIsHidden(false);
								widget(933, 153).setIsHidden(false);
								widget(933, 152).setSprite(2850);
								widget(933, 153).setSprite(2849);
								break;
							case 8:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 152).setIsHidden(false);
								widget(933, 153).setIsHidden(false);
								widget(933, 154).setIsHidden(false);
								widget(933, 153).setSprite(2850);
								widget(933, 154).setSprite(2849);
								break;
							case 9:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 152).setIsHidden(false);
								widget(933, 153).setIsHidden(false);
								widget(933, 154).setIsHidden(false);
								widget(933, 155).setIsHidden(false);
								widget(933, 154).setSprite(2850);
								widget(933, 155).setSprite(2849);
								break;
							case 10:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 152).setIsHidden(false);
								widget(933, 153).setIsHidden(false);
								widget(933, 154).setIsHidden(false);
								widget(933, 155).setIsHidden(false);
								widget(933, 156).setIsHidden(false);
								widget(933, 155).setSprite(2850);
								widget(933, 156).setSprite(2849);
								break;
							case 11:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 152).setIsHidden(false);
								widget(933, 153).setIsHidden(false);
								widget(933, 154).setIsHidden(false);
								widget(933, 155).setIsHidden(false);
								widget(933, 156).setIsHidden(false);
								widget(933, 157).setIsHidden(false);
								widget(933, 156).setSprite(2850);
								widget(933, 157).setSprite(2849);
								break;
							case 12:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 152).setIsHidden(false);
								widget(933, 153).setIsHidden(false);
								widget(933, 154).setIsHidden(false);
								widget(933, 155).setIsHidden(false);
								widget(933, 156).setIsHidden(false);
								widget(933, 157).setIsHidden(false);
								widget(933, 158).setIsHidden(false);
								widget(933, 157).setSprite(2850);
								widget(933, 158).setSprite(2849);
								break;
							case 13:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 152).setIsHidden(false);
								widget(933, 153).setIsHidden(false);
								widget(933, 154).setIsHidden(false);
								widget(933, 155).setIsHidden(false);
								widget(933, 156).setIsHidden(false);
								widget(933, 157).setIsHidden(false);
								widget(933, 158).setIsHidden(false);
								widget(933, 159).setIsHidden(false);
								widget(933, 158).setSprite(2850);
								widget(933, 159).setSprite(2849);
								break;
							case 14:
								widget(933, 146).setIsHidden(false);
								widget(933, 147).setIsHidden(false);
								widget(933, 148).setIsHidden(false);
								widget(933, 149).setIsHidden(false);
								widget(933, 150).setIsHidden(false);
								widget(933, 151).setIsHidden(false);
								widget(933, 152).setIsHidden(false);
								widget(933, 153).setIsHidden(false);
								widget(933, 154).setIsHidden(false);
								widget(933, 155).setIsHidden(false);
								widget(933, 156).setIsHidden(false);
								widget(933, 157).setIsHidden(false);
								widget(933, 158).setIsHidden(false);
								widget(933, 159).setIsHidden(false);
								widget(933, 160).setIsHidden(false);
								widget(933, 159).setSprite(2850);
								widget(933, 160).setSprite(2849);
								break;
						}
					}
				} else {
					widget(933, 67).setText("n/a");
					VARC[1186] = VARC[1186] + 2;
				}
				int0 = (10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236]) * 10000 / complexityDivider * 10000 / getGuideModeDivider_3275();
				int1 = (10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236]) * 10000 / complexityDivider * 10000 / getGuideModeDivider_3275() * 10000 / deathDivider;
				if (int8 == 0) {
					VARC[1270] = int0;
				}
				if (int1 >= int0) {
					widget(933, 67).setText("+" + str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				} else {
					widget(933, 67).setText(str((int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				}
				widget(933, 96).setText(str((int0 + int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				if ((int0 + int8 * 100 / (int1 - int0) + 50) / 100 != VARC[1270]) {
					playSoundEffect(8806, 1, 0);
					VARC[1270] = (int0 + int8 * 100 / (int1 - int0) + 50) / 100;
				}
				widget(933, 112).setSize(8192 * 100 / ((int0 + int8 * 100 / (int1 - int0) + 50) / 100), 16384, 2, 2);
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25 + 150 + 100) {
				widget(933, 53).setIsHidden(true);
				widget(933, 37).setIsHidden(false);
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25 + 150) + 1) * 100 / 100;
				if (int8 == 0) {
					VARC[1270] = 0;
				}
				if (VARC[1321] > 0) {
					widget(933, 84).setIsHidden(false);
					if (int8 == 1) {
						playSoundEffect(8802, 1, 0);
					}
					widget(933, 94).setText("Unbalanced party penalty: x" + str((10000 - VARC[1321] + 50) / 100) + "%");
					if ((10000 - VARC[1321] + 50) / 100 != VARC[1270]) {
						playSoundEffect(8806, 1, 0);
						VARC[1270] = (10000 - VARC[1321] + 50) / 100;
					}
				} else {
					VARC[1186] = VARC[1186] + 2;
				}
				int0 = (10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236]) * 10000 / complexityDivider * 10000 / getGuideModeDivider_3275() * 10000 / deathDivider;
				int1 = (10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236]) * 10000 / complexityDivider * 10000 / getGuideModeDivider_3275() * 10000 / deathDivider * 10000 / (10000 - VARC[1321]);
				widget(933, 96).setText(str((int0 + int8 * 100 / (int1 - int0) + 50) / 100) + "%");
				widget(933, 112).setSize(8192 * 100 / ((int0 + int8 * 100 / (int1 - int0) + 50) / 100), 16384, 2, 2);
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25 + 150 + 100 + 200) {
				widget(933, 13).setIsHidden(true);
				widget(933, 16).setIsHidden(true);
				widget(933, 14).setIsHidden(true);
				widget(933, 15).setIsHidden(true);
				widget(933, 39).setText(str(VARC[1239]));
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25 + 150 + 100) + 1) * 200 / 100;
				int0 = VARC[1239];
				int1 = (10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236]) * 10000 / complexityDivider * 10000 / getGuideModeDivider_3275() * 10000 / deathDivider * 10000 / (10000 - VARC[1321]) * 10000 / VARC[1239];
				if (int8 == 0) {
					VARC[1270] = int0;
				}
				if (int8 % 5 == 0 && widget(933, 84).getY() != 138) {
					widget(933, 84).setPosition(widget(933, 84).getX(), widget(933, 84).getY() + 1, 0, 0);
				}
				widget(933, 111).setSize(183, 80 * 100 / int8, 0, 0);
				widget(933, 39).setText(str((int0 + int8 * 100 / (int1 - int0) + 5) / 10) + "%");
				if ((int0 + int8 * 100 / (int1 - int0) + 5) / 10 != VARC[1270]) {
					playSoundEffect(9243, 1, 0);
					VARC[1270] = (int0 + int8 * 100 / (int1 - int0) + 5) / 10;
				}
			} else if (VARC[1186] < 25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25 + 150 + 100 + 200 + 100) {
				int8 = (VARC[1186] - (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25 + 150 + 100 + 200) + 1) * 100 / 100;
				int0 = VARC[1239];
				int1 = (10000 + sizeBonus + roomLevelMod + difficultyBonus + VARC[1236]) * 10000 / complexityDivider * 10000 / getGuideModeDivider_3275() * 10000 / deathDivider * 10000 / (10000 - VARC[1321]) * 10000 / VARC[1239];
				if (int8 == 0) {
					VARC[1270] = int0;
				}
				if (VARP[1780] < 2000000000) {
					widget(933, 41).setText(str((int0 + int8 * 100 / (int1 - int0) + 5) / 100) + "%");
					if ((int0 + int8 * 100 / (int1 - int0) + 5) / 100 != VARC[1270]) {
						playSoundEffect(8800, 1, 0);
						VARC[1270] = (int0 + int8 * 100 / (int1 - int0) + 5) / 100;
					}
				} else {
					widget(933, 41).setText("n/a");
				}
			}
			VARC[1186] = min(script_3265() + (25 + 25 + 50 + 25 + 25 + 50 + 25 + 25 + 50 + 100 + 50 + 25 + 150 + 25 + 100 + 25 + 100 + 25 + 50 + 25 + 50 + 25 + 25 + 25 + 150 + 100 + 200 + 100), VARC[1186] + 1);
		}
		script_3268();
		return;
	}
}