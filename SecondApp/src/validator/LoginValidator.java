package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.apache.log4j.*;

import model.Constants;


public class LoginValidator implements Validator 
{
	private static Logger logger = Logger.getLogger("LoginValidator.class");

	@Override
	public void validate(final FacesContext context,final UIComponent component,final Object value) throws ValidatorException
	{
		final String user=(String) value;
		if(!user.equalsIgnoreCase(Constants.USER_NAME))
		{
			logger.error("Login incorrect");
			final FacesMessage message = new FacesMessage();
			message.setDetail("User "+user+"doesnt exist ");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			message.setSummary("Login incorrect");
			throw new ValidatorException(message);			
		}
	}

}
