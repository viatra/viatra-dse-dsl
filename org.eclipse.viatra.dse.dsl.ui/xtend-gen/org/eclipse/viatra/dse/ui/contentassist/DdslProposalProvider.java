/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.viatra.dse.ui.contentassist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.viatra.dse.ui.contentassist.AbstractDdslProposalProvider;
import org.eclipse.viatra.query.runtime.registry.IDefaultRegistryView;
import org.eclipse.viatra.query.runtime.registry.IQuerySpecificationRegistry;
import org.eclipse.viatra.query.runtime.registry.IQuerySpecificationRegistryEntry;
import org.eclipse.viatra.query.runtime.registry.QuerySpecificationRegistry;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class DdslProposalProvider extends AbstractDdslProposalProvider {
  public String getQueryName(final String queryFQN) {
    String[] segments = queryFQN.split("\\.");
    int _length = queryFQN.length();
    String _replace = queryFQN.replace(".", "");
    int _length_1 = _replace.length();
    int count = (_length - _length_1);
    String name = queryFQN;
    if ((count > 0)) {
      String _get = segments[count];
      name = _get;
    }
    return name;
  }
  
  public HashSet<String> getMetaModelNames() {
    EPackage.Registry registry = EPackage.Registry.INSTANCE;
    Set<String> _keySet = registry.keySet();
    HashSet<String> _hashSet = new HashSet<String>(_keySet);
    for (final String key : _hashSet) {
      {
        EPackage ePackage = registry.getEPackage(key);
        String _name = ePackage.getName();
        System.out.println(_name);
      }
    }
    Set<String> _keySet_1 = registry.keySet();
    return new HashSet<String>(_keySet_1);
  }
  
  @Override
  public void completeQueryConstraint_ConstraintName(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeQueryConstraint_Name(model, assignment, context, acceptor);
    IQuerySpecificationRegistry _instance = QuerySpecificationRegistry.getInstance();
    IDefaultRegistryView _defaultView = _instance.getDefaultView();
    Iterable<IQuerySpecificationRegistryEntry> _entries = _defaultView.getEntries();
    Iterator<IQuerySpecificationRegistryEntry> iter = _entries.iterator();
    while (iter.hasNext()) {
      {
        IQuerySpecificationRegistryEntry element = iter.next();
        String _fullyQualifiedName = element.getFullyQualifiedName();
        String proposal = this.getQueryName(_fullyQualifiedName);
        String _queryName = this.getQueryName(proposal);
        ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_queryName, context);
        acceptor.accept(_createCompletionProposal);
      }
    }
  }
  
  @Override
  public void completeMetaModel_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeMetaModel_Name(model, assignment, context, acceptor);
    EPackage.Registry registry = EPackage.Registry.INSTANCE;
    Set<String> _keySet = registry.keySet();
    for (final String key : _keySet) {
      ICompletionProposal _createCompletionProposal = this.createCompletionProposal(key, context);
      acceptor.accept(_createCompletionProposal);
    }
  }
}
