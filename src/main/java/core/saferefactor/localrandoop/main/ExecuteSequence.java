package saferefactor.localrandoop.main;

import saferefactor.localrandoop.ExecutableSequence;
import saferefactor.localrandoop.MultiVisitor;
import saferefactor.localrandoop.RegressionCaptureVisitor;
import saferefactor.localrandoop.Sequence;
import saferefactor.localrandoop.main.CommandHandler;
import saferefactor.localrandoop.main.RandoopTextuiException;
import saferefactor.localrandoop.util.Files;



public class ExecuteSequence extends CommandHandler {

  public ExecuteSequence() {
    super("exec", null, null, null, null, null, null, null, null, null);
  }

  @Override
  public boolean handle(String[] args) throws RandoopTextuiException {

    saferefactor.localrandoop.util.ReflectionExecutor.usethreads = false;

    assert args.length == 1;
    Sequence seq = null;
    try {
      seq = Sequence.parse(Files.readWhole(args[0]));
    } catch (Exception e) {
      throw new Error(e);
    }
    
    System.out.println(seq.toCodeString());

    ExecutableSequence es = new ExecutableSequence(seq);

    MultiVisitor mv = new MultiVisitor();
    mv.visitors.add(new RegressionCaptureVisitor());

    //        for (int x = 0 ; x < 20 ; x++) {

    es.execute(mv);

    // Print execution result.
    for (int i = 0 ; i < seq.size() ; i++) {
      System.out.println(es.getResult(i));
    }

    //        }

    return true;
  }

}
