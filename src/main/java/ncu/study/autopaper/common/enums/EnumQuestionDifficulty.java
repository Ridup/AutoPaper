package ncu.study.autopaper.common.enums;

/**
 * @author Ridup
 * @version FleName:  EnumQuestionDifficulty .java  v0.1  2018/5/8 1:27 Exp $
 */
public enum EnumQuestionDifficulty implements EnumMessage {
    difficulty_1("1", "难度一"),
    difficulty_2("2", "难度二"),
    difficulty_3("3", "难度三"),
    difficulty_4("4", "难度四"),
    difficulty_5("5", "难度五");

    /** 状态码 */
    private String code;
    /** 状态描述 */
    private String desc;

    /**
     * 私有构造方法
     *
     * @param code
     *            编码
     * @param desc
     *            描述
     */
    private EnumQuestionDifficulty(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据编码查找枚举
     *
     * @param code
     *            编码
     * @return {@link EnumQuestionDifficulty} 实例
     */
    public static EnumQuestionDifficulty find(String code) {
        for (EnumQuestionDifficulty frs : EnumQuestionDifficulty.values()) {
            if (frs.getCode().equals(code)) {
                return frs;
            }
        }
        return null;
        // throw new Exception("错误码", "根据code=" + code+ "获取渠道标示失败");
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    @Override
    public Object getValue() {
        //此处需要根据枚举对象的哪个属性返回枚举对象，就return该属性
        return code;
    }
}
