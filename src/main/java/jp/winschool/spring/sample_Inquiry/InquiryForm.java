package jp.winschool.spring.sample_Inquiry;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class InquiryForm {
	
	@NotBlank(message = "名前を入力してください。")
	private String name;
	
	@NotBlank(message = "メールアドレスを入力してください。")
	private String email;
	
	@NotNull(message = "年齢を入力してください。")
	@Min(value = 20, message = "年齢は20以上で入力してください。")
	private Integer age;

	private String gender;
}
