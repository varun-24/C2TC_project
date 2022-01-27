package technoserve.c2tc.b5.enu;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum dept {
	@Enumerated(EnumType.STRING)
	SALES,MARKETING,PURCHASES
}
