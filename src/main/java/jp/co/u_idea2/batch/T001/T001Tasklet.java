package jp.co.u_idea2.batch.T001;

import jp.co.u_idea2.batch.common.exception.U_idea2BatchException;
import jp.co.u_idea2.batch.common.logging.LogMessages;
import jp.co.u_idea2.batch.common.util.DateUtil;
import jp.co.u_idea2.batch.common.util.SendGridUtil;
import jp.co.u_idea2.batch.jbba00.FlightDto;
import jp.co.u_idea2.batch.jbba01001.FlightUpdateDto;
import jp.co.u_idea2.batch.jbba01001.JBBA01001BatchDao;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component("T001Tasklet")
@Scope("step")
public class T001Tasklet implements Tasklet {

    private static final Logger LOGGER = LoggerFactory.getLogger(T001Tasklet.class);

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {


        SendGridUtil sgu = new SendGridUtil();
        sgu.sendMail("ivan@ui2.co.jp","ivan@ui2.co.jp",null,null,"Testinf to send by gradle", "WOW, Sent Successfully");

        // ジョブ終了コード（0:正常終了）
        contribution.setExitStatus(new ExitStatus("NORMAL"));

        return RepeatStatus.FINISHED;
    }
}
