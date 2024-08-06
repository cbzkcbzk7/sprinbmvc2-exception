package hello.exception.exhandler;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * packageName    : hello.exception.exhandler
 * fileName       : ErrorResult
 * author         : Sora
 * date           : 2024-08-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-06        Sora       최초 생성
 */
@Data
@AllArgsConstructor
public class ErrorResult {
    private String code;
    private String message;
}


