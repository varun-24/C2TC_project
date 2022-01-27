package technoserve.c2tc.b5.enu;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum paymentmode {
	@Enumerated(EnumType.STRING)
   CASH,CREDIT_CARD,DEBIT_CARD
}
