package tina.coffee.system.exceptions.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import tina.coffee.system.exceptions.generic.ErrorDTO;
import tina.coffee.system.exceptions.menucategory.MenuCategoryBusinessException;
import tina.coffee.system.exceptions.menucategorylanguage.MenuCategoryLanguageBusinessException;

@ControllerAdvice
public class MenuCategoryExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler(MenuCategoryLanguageBusinessException.class)
    public ResponseEntity<ErrorDTO> handlerMenuCategoryLanguageBusinessException(MenuCategoryLanguageBusinessException ex) {
        String errorMessage = messageSource.getMessage(ex.getMessageTemplate(), ex.getParameters(), LocaleContextHolder.getLocale());
        logger.error(errorMessage);

        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setHttpCode(ex.getErrorStatus().getStatusCode());
        errorDTO.setMessage(errorMessage);
        return new ResponseEntity<>(errorDTO, ex.getErrorHttpStatus());
    }

    @ExceptionHandler(MenuCategoryBusinessException.class)
    public ResponseEntity<ErrorDTO> handlerMenuCategoryBusinessException(MenuCategoryBusinessException ex) {
        String errorMessage = messageSource.getMessage(ex.getMessageTemplate(), ex.getParameters(), LocaleContextHolder.getLocale());
        logger.error(errorMessage);

        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setHttpCode(ex.getErrorStatus().getStatusCode());
        errorDTO.setMessage(errorMessage);
        return new ResponseEntity<>(errorDTO, ex.getErrorHttpStatus());
    }
}
