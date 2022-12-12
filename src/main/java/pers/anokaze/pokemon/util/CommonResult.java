package pers.anokaze.pokemon.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author AnoKaze
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult {
    private static final Integer SUCCESS_CODE = 0;
    private static final String SUCCESS_MESSAGE = "success";

    private Integer code;
    private String message;
    private Object data;

    public static CommonResult success(){
        return success(null);
    }

    public static CommonResult success(Object data){
        return new CommonResult(SUCCESS_CODE, SUCCESS_MESSAGE, data);
    }

    public static CommonResult failed(Integer code, String message) {
        return failed(code, message, null);
    }

    public static CommonResult failed(Integer code, String message, Object data) {
        return new CommonResult(code, message, data);
    }
}
